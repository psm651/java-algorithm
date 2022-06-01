package programmers.no3;

public class Main {
    public static void main(String[] args) {
//        String test = "aabbaccc";
//        String test = "ababcdcdababcdcd";
//        String test = "abcabcdede";
        String test = "abcabcabcabcdededededede";
        String shortest = "";
        int answer = test.length();
        //몇개씩 자를지 확인
        for (int i = 1; i < test.length() / 2 + 1; i++) {
            String last = "";
            String prev = test.substring(0, i);
            int count = 1;
            String enc = "";
            for (int j = i; j < test.length(); j += i) {
                if (i + j > test.length()) {
                    last = test.substring(j);
                    break;
                }
                String dup_check = test.substring(j, j + i);
                if (prev.equals(dup_check)) {
                    count++;
                } else {
                    //tmp 변경
                    enc += prev;
                    if (count != 1) {
                        enc = count + enc;
                    }
                    prev = dup_check;
                    count = 1;
                }
            }
            enc += prev + last;
            if (count != 1) {
                enc = count + enc;
            }
            answer = Math.min(answer, enc.length());
        }
    }
}

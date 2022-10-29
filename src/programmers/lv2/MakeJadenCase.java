package programmers.lv2;


public class MakeJadenCase {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        String s = "3people  unFollowed me  ";
        String[] data = s.toLowerCase().split("");
        boolean isUpperCase = true;
        for (String datum : data) {
            if (isUpperCase) {
                answer.append(datum.toUpperCase());
            } else {
                answer.append(datum);
            }
            if (datum.equals(" ")) {
                isUpperCase = true;
            }else {
                isUpperCase = false;
            }
        }
        System.out.println(answer);
    }
}

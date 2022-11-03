package programmers.lv2;


public class MakeBinaryNumber {
    public static void main(String[] args) {
        String s = "01110";
        int[] answer;
        int a = 0;
        int b = 0;
        int asdf = 999999;
        while (asdf != 1) {
            int tmp = s.length();
            s = s.replace("0", "");
            asdf = s.length();
            b += tmp - asdf;
            a++;
            s = Integer.toBinaryString(asdf);
        }
        answer= new int[]{a, b};
        System.out.println(answer);
    }
}

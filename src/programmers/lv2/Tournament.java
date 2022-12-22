package programmers.lv2;

public class Tournament {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int max = 1;
        while (true) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            if (a == b) {
                break;
            }
            max++;
        }
        System.out.println(max);

    }
}

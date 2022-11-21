package programmers.lv2;

public class Carpet {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        int[] answer = new int[2];

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i != 0) {
                continue;
            }
            int tmp = yellow / i;

            if (((tmp + 2) * (i + 2)) - yellow == brown) {
                answer[0] = tmp + 2;
                answer[1] = i + 2;
                break;
            }
        }
    }
}

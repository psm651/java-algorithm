package programmers.lv2;

public class JumpAndWarp {
    public static void main(String[] args) {
        int N = 6;
        int answer = 0;

        while (N > 0) {
            if (N % 2 == 0) {
                N = N / 2;
            } else {
                N -= 1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}

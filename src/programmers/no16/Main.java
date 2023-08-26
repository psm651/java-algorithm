package programmers.no16;

public class Main {
    public static void main(String[] args) {

        System.out.printf(String.valueOf((solution(4))));
    }

    public static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}

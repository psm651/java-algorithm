package step2.dp.bj9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        dp[6] = 3;
        dp[7] = 4;
        dp[8] = 5;
        dp[9] = 7;
        dp[10] = 9;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N > 10) {
                for (int j = 11; j <=N; j++) {
                    dp[j] = dp[j-1] + dp[j-5];
                }
            }
            System.out.println(dp[N]);
        }
    }
}

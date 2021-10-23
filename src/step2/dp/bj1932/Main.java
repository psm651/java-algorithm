package step2.dp.bj1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    dp[i][j] = Integer.parseInt(tmp[j]);
                    break;
                }
                if (j == 0) {
                    dp[i][j] = Integer.parseInt(tmp[j]) + dp[i-1][j];
                    continue;
                }
                if (j == n) {
                    dp[i][j] = Integer.parseInt(tmp[n]) + dp[i-1][n];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j] + Integer.parseInt(tmp[j]), dp[i - 1][j - 1] + Integer.parseInt(tmp[j]));
            }
        }
        int tmp = 0;
        for (int j = 0; j < n; j++) {
            if (tmp < dp[n-1][j]) {
                tmp = dp[n - 1][j];
            }
        }
        System.out.println(tmp);
    }
}

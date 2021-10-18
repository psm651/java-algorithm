package step2.dp.bj1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[][] dp;
    static int RED = 0;
    static int GREEN = 1;
    static int BLUE = 2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N + 1][3];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if (i == 1) {
                dp[i][RED] = Integer.parseInt(st.nextToken());
                dp[i][GREEN] = Integer.parseInt(st.nextToken());
                dp[i][BLUE] = Integer.parseInt(st.nextToken());
            } else {
                dp[i][RED] = Math.min(dp[i - 1][GREEN], dp[i - 1][BLUE]) + Integer.parseInt(st.nextToken());
                dp[i][GREEN] = Math.min(dp[i - 1][RED], dp[i - 1][BLUE]) + Integer.parseInt(st.nextToken());
                dp[i][BLUE] = Math.min(dp[i - 1][GREEN], dp[i - 1][RED]) + Integer.parseInt(st.nextToken());
            }
        }
        long result = dp[N][RED];
        for (long l : dp[N]) {
            if (l < result) {
                result = l;
            }
        }
        System.out.println(result);
    }
}

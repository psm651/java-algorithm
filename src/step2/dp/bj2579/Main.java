package step2.dp.bj2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;
    static int[] stair;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        stair = new int[n+1];
        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = stair[0];
        dp[1] = stair[1];

        if (n >= 2) {
            dp[2] = stair[2] + stair[1];
        }
        System.out.println(find(n));
    }

    static int find(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(find(N - 2), find(N - 3) + stair[N - 1]) + stair[N];
        }
        return dp[N];
    }
}

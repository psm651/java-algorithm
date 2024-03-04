package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bf.readLine());
        int count = 0;
        int plus = 1;
        int num = 10;

        for (long i = 1; i <= n; i++) {
            if (i % num == 0) {
                plus++;
                num *= 10;
            }
            count += plus;
        }
        System.out.println(count);
    }
}

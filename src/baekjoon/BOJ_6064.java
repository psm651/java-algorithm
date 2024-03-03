package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            int M, N, x, y;
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            M = Integer.parseInt(stringTokenizer.nextToken());
            N = Integer.parseInt(stringTokenizer.nextToken());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            int lcm = M * N / gcd(M, N);
            int n = 0;
            int answer = -1;
            while (n * M < lcm) {
                if ((n * M + x - y) % N == 0) {
                    answer = n * M + x;
                    break;
                }
                n++;
            }
            System.out.println(answer);
        }
    }

    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}

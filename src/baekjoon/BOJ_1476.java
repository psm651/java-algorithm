package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int E = 0;
        int S = 0;
        int M = 0;
        int year = 0;
        while (true) {
            year++;
            E++;
            S++;
            M++;
            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;
            if (E == e && M == m && S == s) break;
        }
        System.out.println(year);
    }
}

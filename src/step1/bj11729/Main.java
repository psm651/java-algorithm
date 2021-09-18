package step1.bj11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//하노이탑
public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        //개수, 하노이공식
        sb.append((int) Math.pow(2, N) - 1).append("\n");
        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int N, int start, int tmp, int finish) {
        if (N == 1) {
            sb.append(start + " " + finish + "\n");
            return;
        }
        //step 1 : n-1개 원판을 템프로
        hanoi(N - 1, start, finish, tmp);
        //step 2 : n번째 원판을 목적지로
        sb.append(start + " " + finish + "\n");
        //step 3 : n-1개 원판을 목적지로
        hanoi(N - 1, tmp, start, finish);
    }
}

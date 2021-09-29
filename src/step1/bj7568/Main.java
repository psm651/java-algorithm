package step1.bj7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] userList = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");
            userList[i][0] = Integer.parseInt(tmp[0]);
            userList[i][1] = Integer.parseInt(tmp[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int lank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (userList[i][0] < userList[j][0] && userList[i][1] < userList[j][1]) {
                    lank++;
                }
            }
            sb.append(lank).append(" ");
        }
        System.out.println(sb);
    }
}
package step1.bj2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer result = new StringBuffer();
        for (int t = 0; t < T; t++) {
            String[] tmp = br.readLine().split(" ");
            int R = Integer.parseInt(tmp[0]);
            String S = tmp[1];
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    result.append(S.charAt(i));
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}

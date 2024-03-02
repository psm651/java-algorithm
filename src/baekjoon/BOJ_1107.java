package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int nowChannel = 100;
        int count = 0;
        int errorButtonCount = Integer.parseInt(bf.readLine());
        boolean[] errorButtons = new boolean[10];
        if (errorButtonCount > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < errorButtonCount; i++) {
                errorButtons[Integer.parseInt(st.nextToken())] = true;
            }
        }
        if (N == nowChannel) {
            System.out.println(count);
            return;
        }

        count = Math.abs(N - nowChannel);
        for (int i = 0; i <= 999999; i++) {
            String num = String.valueOf(i);

            boolean isBreak = false;
            for (int j = 0; j < num.length(); j++) {
                if (errorButtons[num.charAt(j) - '0']) {
                    //고장난 버튼을 눌러야 하면 멈춘다.
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                //버튼을 누르는 횟수 중 가장 적은 횟수를 result에 담는다.
                int min = Math.abs(N - i) + num.length();
                count = Math.min(min, count);
            }
        }
        System.out.println(count);
    }
}

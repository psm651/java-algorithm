package programmers.lv1;

import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] answer = new int[2];
        int[] A = {44, 1, 0, 0, 31, 25};
        int[] B = {31, 10, 45, 1, 6, 19};
        int x = 0;
        int y = 0;

        for (int a : A) {
            if (a == 0) {
                y += 1;
                continue;
            }
            if (Arrays.asList(B).contains(a)) {
                x += 1;
                y += 1;
            }
        }
        answer[0] = x;
        answer[1] = y;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}

package step2.stack.bj17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] stack = new int[N];
        int top = -1;
        StringBuilder sb = new StringBuilder();
        String[] tmp = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }

        for (int i = 0; i < N; i++) {
            while (top != -1 && arr[stack[top]] < arr[i]) {
                arr[stack[top]] = arr[i];
                top--;
            }
            top++;
            stack[top] = i;
        }

        for (int i = top; i >= 0; i--) {
            arr[stack[i]] = -1;
        }
        for (int i : arr) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}

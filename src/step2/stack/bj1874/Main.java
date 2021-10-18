package step2.stack.bj1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        stack = new Stack<>();
        int start = 0;
        while (n-- > 0) {
            int val = Integer.parseInt(br.readLine());
            if (start < val) {
                for (int i = start + 1; i <= val; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = val;
            } else if (stack.peek() != val) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}

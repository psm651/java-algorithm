package step2.stack.bj9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String tmp = br.readLine();
            boolean result = true;
            for (int j = 0; j < tmp.length(); j++) {
                if(tmp.charAt(j) == ')'){
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }else {
                        stack.pop();
                    }
                }else if(tmp.charAt(j) == '('){
                    stack.push("(");
                }
            }
            if (result != false && stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}

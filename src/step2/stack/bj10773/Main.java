package step2.stack.bj10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int result = 0;
        Stack<Integer> commandList = new Stack<Integer>();
        for (int i = 0; i < K; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                commandList.pop();
                continue;
            }
            commandList.push(tmp);
        }
        while (!commandList.empty()) {
            result += commandList.pop();
        }
        System.out.println(result);
    }
}
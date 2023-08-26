package programmers.no17;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String test = "415363";
        int k = 3;
        Stack<Character> stack = new Stack<>();
        for (char c : test.toCharArray()) {
            while (!stack.empty() && k > 0 && stack.peek() < c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        System.out.println(sb);
    }
}

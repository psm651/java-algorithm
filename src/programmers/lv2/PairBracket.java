package programmers.lv2;

import java.util.Stack;

public class PairBracket {
    public static void main(String[] args) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        String s = "()()()";
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(') {
                stack.push(t);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        System.out.println(answer);
    }
}

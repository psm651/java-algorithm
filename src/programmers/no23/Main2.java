package programmers.no23;

import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("1011"));

    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() != c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}

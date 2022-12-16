package programmers.lv2;

import java.util.*;

public class KillTheCouple {
    public static void main(String[] args) {
//        String s = "baabaa";
        String s = "cdcd";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        if (stack.isEmpty()) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}

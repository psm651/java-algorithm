package programmers.no20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static int result = 0;

    public static void main(String[] args) {
//        String s = "[](){}";
        String s = "}]()[{";
//        Queue<String> queue = Arrays.stream(s.split("")).collect(Collectors.toList());
        Queue<String> queue = Arrays.stream(s.split("")).collect(Collectors.toCollection(LinkedList::new));
        for (int i = 0; i < s.length(); i++) {
            //0일경우 그대로하고 continue
            if (i == 0) {
                checkPair(queue);
                continue;
            }
            String nextNum = queue.poll();
            queue.add(nextNum);
            checkPair(queue);
        }
        System.out.println(result);
    }

    //공통 = stack에 순서대로넣고짝맞는지검증
    public static void checkPair(Queue queue) {
        Queue<String> cloneQueue = new LinkedList<>(queue);
        Stack<String> stack = new Stack<>();
        while (!cloneQueue.isEmpty()) {
            String a = cloneQueue.poll();
            if (!stack.isEmpty()) {
                if (isPair(stack.peek()).equals(a)) {
                    stack.pop();
                } else {
                    stack.push(a);
                }
            } else {
                stack.push(a);
            }
        }
        if (stack.isEmpty()) {
            result++;
        }
    }

    public static String isPair(String s) {
        if (s.equals("(")) {
            return ")";
        }
        if (s.equals("{")) {
            return "}";
        }
        if (s.equals("[")) {
            return "]";
        }
        return  "";
    }
}

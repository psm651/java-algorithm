package programmers.business.no1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /**
         * stack을 이용하여
         * 1,2,3 -> true
         * 3,1,2 -> false
         */
        int[] arr = {1, 2, 3};
        System.out.println(solution(arr));
        int[] arr2 = {3, 1, 2};
        System.out.println(solution(arr2));
    }

    public static boolean solution(int[] arr) {
        int needVal = 1;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (needVal <= arr[i]) {
                st.push(needVal);
                needVal++;
            }

            if (!st.isEmpty() && st.peek() == arr[i]) {
                st.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
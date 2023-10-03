package programmers.no19;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] elemnets = new int[]{7, 9, 1, 1, 4};
        int start = 0;
        Set<Integer> set = new HashSet<>();

        //길이
        for (int j = 0; j < elemnets.length; j++) {
            int result = 0;
            start = 0;
//        시작점
            for (int i = start; i < elemnets.length - 1; i++) {
                int at = i + j;
                if (at > elemnets.length - 1) {
                    at -= elemnets.length;
                }
                result += elemnets[at];
                set.add(result);
            }
        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

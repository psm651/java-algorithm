package programmers.no25;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] elements = new int[]{7, 9, 1, 1, 4};
        Set<Integer> set = new HashSet<>();

        //길이
        for (int j = 1; j <= elements.length; j++) {
            //시작점
            for (int i = 0; i <= elements.length; i++) {
                int result = 0;
                for (int k = i; k < j + i; k++) {
                    result += elements[k% elements.length];
                }
                set.add(result);
            }
        }
        System.out.println(set.size());
    }
}

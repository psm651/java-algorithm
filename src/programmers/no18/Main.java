package programmers.no18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k = 6;
        int result = 0;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (k > 0) {
                System.out.println(entry.getValue());
                k -= entry.getValue();
                result += 1;
            }
        }
        System.out.println(result);
    }
}

package programmers.no22;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], map.getOrDefault(map.get(want[i]), 0) + 1);
        }

        for (int i = 0; i < discount.length; i++) {
            for (int j = 1; j <= 10; j++) {
                if (map.containsKey(discount[i + j])) {
                    map.put(discount[i + j], map.get(discount[i + j]) - 1);
                }
            }
        }


    }
}

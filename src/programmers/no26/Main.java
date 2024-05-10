package programmers.no26;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int solution = Solution.solution(want, number, discount);
        System.out.printf(String.valueOf(solution));

    }

    public static class Solution {
        public static int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            boolean isSame;
            Map<String, Integer> wantMap = new HashMap<>();
            for (int i = 0; i < want.length; i++) {
                wantMap.put(want[i], number[i]);
            }
            for (int i = 0; i < discount.length - 9; i++) {

                Map<String, Integer> dMap = new HashMap<>();
                for (int j = 0; j < 10; j++) {
                    dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
                }
                isSame = true;
                for (String key : wantMap.keySet()) {
                    if (!wantMap.get(key).equals(dMap.get(key))) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    answer++;
                }
            }
            return answer;
        }
    }
}

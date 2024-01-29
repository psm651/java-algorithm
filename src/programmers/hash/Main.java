package programmers.hash;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"leo", "kiki", "eden"};
        String[] arr1 = {"eden", "kiki"};

        String solution = solution(arr, arr1);
        System.out.println(solution);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String s : completion) {
            if (map.get(s).equals(1)) {
                map.remove(s);
            } else {
                map.put(s, map.get(s) - 1);
            }
        }
        Set<String> strings = map.keySet();
        for (String string : strings) {
            answer= string;
        }
        return answer;
    }
}

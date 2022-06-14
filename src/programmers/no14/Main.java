package programmers.no14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String s : participant) {
            participantMap.put(s, participantMap.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            participantMap.put(s, participantMap.getOrDefault(s, 0) - 1);
        }
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) != 0) {
                answer = key;
                System.out.println(answer);
                break;
            }

        }
    }
}

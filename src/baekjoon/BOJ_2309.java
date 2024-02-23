package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BOJ_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int personCount = 9;
        List<Integer> result = new ArrayList<>();
        List<String> targetList = new ArrayList<>();
        for (int i = 0; i < personCount; i++) {
            targetList.add(br.readLine());
        }
        for (int i = 0; i < personCount - 1; i++) {
            for (int j = 1; j < personCount; j++) {
                List<String> checkList = new ArrayList<>(targetList);
                checkList.remove(targetList.get(i));
                checkList.remove(targetList.get(j));
                int sum = checkList.stream().mapToInt(Integer::parseInt).sum();
                if (sum == 100) {
                    Collections.sort(checkList);
                    result = checkList.stream()
                            .map(Integer::parseInt)
                            .sorted()
                            .collect(toList());
                    break;
                }
            }
        }
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}

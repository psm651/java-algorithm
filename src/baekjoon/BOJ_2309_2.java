package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_2309_2 {
    public static void main(String[] args) throws IOException {
        int personCount = 9;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer[] hobbits = new Integer[9];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < personCount; i++) {
            hobbits[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(hobbits);
        for (int i = 0; i < personCount - 1; i++) {
            for (int j = i + 1; j < personCount; j++) {
                List<Integer> realHobbits = new ArrayList<>(Arrays.asList(hobbits));
                realHobbits.remove(hobbits[i]);
                realHobbits.remove(hobbits[j]);
                int sum = realHobbits.stream().mapToInt(k -> k).sum();
                if (sum == 100) {
                    result = realHobbits;
                    break;
                }
            }
        }
        for (Integer s : result) {
            System.out.println(s);
        }
    }
}

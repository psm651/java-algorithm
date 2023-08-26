package programmers.lv2;

import java.util.Arrays;
import java.util.Collections;

public class lifeboat {
    public static void main(String[] args) {
//        int[] people = {70, 50, 80, 50};
        int[] people = {10, 20, 30, 80, 90};
//        int[] people = {70, 80, 50};
        int limit = 100;
        int answer = 0;
        int weight = 0;
        boolean flag = false;
        Arrays.sort(people);
        //제일 무거운애랑 가벼운애 짝지어주기
        for (int i = people.length; i > 0; i--) {
            if (flag) break;
            for (int j = 0; j < i; j++) {
                if (people[i] + people[j] > limit) {
                    flag = true;
                    break;
                }
                if (people[i] + people[j] <= limit) {
                    people[i] = 0;
                    people[j] = 0;
                    answer++;
                    break;
                }
            }
        }
        answer+=people.length-Collections.frequency(Arrays.asList(people), 0);

        System.out.println(answer);
    }
}

package programmers.no21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] citations = new int[]{3, 0, 6, 1, 5};
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 인용된 논문의 수

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        System.out.println(answer);
    }
}

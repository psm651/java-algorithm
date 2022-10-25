package programmers.no15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int K = 7;

        int result = solution(scoville, K);
    }
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.stream(scoville).sorted();
        return answer;
    }
}

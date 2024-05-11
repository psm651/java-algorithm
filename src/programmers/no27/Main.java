package programmers.no27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(solution(4, 7, 14)).forEach(System.out::println);
    }

    /**
     * @param n
     * @param left
     * @param right
     * @return 123--n
     * 2234--n
     * 3334--n
     */

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];

        for(int i = 0; i < answer.length; i++){
            int row = (int)((i + left) / n) + 1; // 행
            int col = (int)((i + left) % n) + 1; // 열
            answer[i] = Math.max(row, col);
        }

        return answer;
    }
}

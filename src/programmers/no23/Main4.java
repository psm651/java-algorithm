package programmers.no23;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] scores = new int[]{3,2,1,2};
        int n = scores.length;
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        for (int i = 0; i < ranks.length; i++) {
            System.out.println(ranks[i]);
        }

    }
}

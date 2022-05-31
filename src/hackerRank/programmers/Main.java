package hackerRank.programmers;

public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int[] answer = new int[2];
                int[] scoreBoard = {6,6,5,4,3,2,1};
                int count = 0;
                int zero = 0;
                int bestScore=0;
                int worstScore=0;
                for (int s : lottos) {
                    if (s == 0) {
                        zero++;
                        continue;
                    }
                    for (int num : win_nums) {
                        if (s == num) {
                            count++;
                            continue;
                        }
                    }
                }
                bestScore=scoreBoard[count+zero];
                worstScore=scoreBoard[count];
                answer[0] = bestScore;
                answer[1] = worstScore;
                return answer;
            }
        }
    }
}

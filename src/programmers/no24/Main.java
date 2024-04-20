package programmers.no24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};

        int[] solution = solution(progresses, speeds);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);

        }

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int day = 1;
        int count = 0;
        List<Integer> answer = new ArrayList<Integer>();
        //최초숫자가 100이상될떄까지 날짜를 구함
        //다음숫자들이 날짜*스피드+ 현재진행률 100 이상인 경우 count++
        //100이 안되는 숫자를 만나면 다시 100이되는 숫자를 day++해서 구함
        //progress 끝날떄까지 반복
        for (int i = 0; i < progresses.length; i++) {
            if (progresses[i] + (day * speeds[i]) >= 100) {
                count++;
                if (i == progresses.length - 1) {
                    answer.add(count);
                    count = 0;
                    break;
                } else {
                    continue;
                }
            }
            if (i != 0) {
                answer.add(count);
                count = 0;
            }
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            count++;
        }
        if (count!= 0) {
            answer.add(count);
        }
        return answer.stream().mapToInt(j -> j).toArray();
    }
}

package programmers.no10;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = 0;
        boolean[] checkArr = new boolean[10];
        for (int i = 0; i < numbers.length; i++) {
            checkArr[numbers[i]] = true;
        }
        for (int j = 0; j < checkArr.length; j++) {
            if (checkArr[j] == false) {
                answer += j;
            }
        }
        System.out.println(answer);
    }
}

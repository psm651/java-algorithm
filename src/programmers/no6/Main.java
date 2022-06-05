package programmers.no6;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
            } else {

            }
        }

    }
}

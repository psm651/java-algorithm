package programmers.lv2;

public class MaximumMinimum {
    public static void main(String[] args) {
        String test = "1 2 4 -4";
        String answer;
        int maximum, minimum, tmp;
        String[] numberArray = test.split(" ");
        maximum = minimum = Integer.parseInt(numberArray[0]);
        for (int i = 1; i < numberArray.length; i++) {
            tmp = Integer.parseInt(numberArray[i]);
            if (maximum < tmp) {
                maximum = tmp;
            } else if (minimum > tmp) {
                minimum = tmp;
            }
        }
        answer = minimum + " " + maximum;
        System.out.println(answer);
    }

}

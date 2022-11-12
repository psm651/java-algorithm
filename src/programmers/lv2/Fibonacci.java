package programmers.lv2;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100000;
        int answer = 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = arr[2] = 1;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = ((arr[i - 1] % 1234567) + (arr[i - 2] % 1234567)) % 1234567;
        }
        answer = arr[n];
        System.out.println(answer);
    }
}

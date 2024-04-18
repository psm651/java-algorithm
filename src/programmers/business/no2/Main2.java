package programmers.business.no2;//package programmers.business.no2;


import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 8, 1}; // k:3, t:11 => 6
        int[] arr2 = {1, 1, 2, 2}; // k:2, t:3 => 5
        int[] arr3 = {1, 2, 3, 2}; // k:2, t:2 => 0

    }

    public static int solution(int[] arr, int k, int t) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = k; i <= arr.length; i++) {
            count += getCount(arr, i, t, new int[i], 0, 0, 0);
        }
        return count;
    }


    private static int getCount(int[] array, int k, int t, int[] comb, int curIndex, int curSum, int start) {
        if (curIndex >= k) {
            return (curSum <= t) ? 1 : 0;
        }

        int count = 0;
        for (int i = start; i < array.length; i++) {
            comb[curIndex] = array[i];
            count += getCount(array, k, t, comb, curIndex + 1, curSum + array[i], i + 1);
        }

        return count;
    }
}

package programmers.business.no2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 3, 8, 1};
        Arrays.sort(sortedArray);
        int n = 3;
        int t = 11;

        int count = countSubarrays(sortedArray, n, t);
        System.out.println("경우의 수: " + count);
    }

    //    public static int countCombinations(int[] arr, int k, int t) {
//        List<List<Integer>> result = new ArrayList<>();
//        int length = arr.length;
//
//        // 비트마스크를 사용한 부분집합 생성
//        for (int mask = 1; mask < (1 << length); mask++) {
//            List<Integer> currentCombination = new ArrayList<>();
//            int currentSum = 0;
//            int selectedCount = 0;
//
//            for (int i = 0; i < length; i++) {
//                if ((mask & (1 << i)) != 0) {
//                    // 현재 비트가 1이면 해당 원소를 선택
//                    currentCombination.add(arr[i]);
//                    currentSum += arr[i];
//                    selectedCount++;
//                }
//            }
//
//            if (currentSum <= t && selectedCount >= k) {
//                result.add(new ArrayList<>(currentCombination));
//            }
//        }
//
//        return result.size();
//    }
    private static int countSubarrays(int[] array, int k, int t) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                // 배열의 일부분을 선택 (i부터 j까지)
                int selectedCount = j - i + 1;

                // 선택한 일부분의 합 계산
                for (int m = i; m <= j; m++) {
                    sum += array[m];
                }

                // 만약 선택한 일부분의 합이 t 이하이고, 선택한 수의 갯수가 k 이상이면 count 증가
                if (sum <= t && selectedCount >= k) {
                    count++;
                }

                // sum 초기화
                sum = 0;
            }
        }

        return count;
    }
//    public static int countCombinations(int[] array, int k, int t) {
//        int count = 0;
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                // 배열의 일부분을 선택 (i부터 j까지)
//                int selectedCount = j - i + 1;
//
//                // 선택한 일부분의 합 계산
//                for (int m = i; m <= j; m++) {
//                    sum += array[m];
//                }
//
//                // 만약 선택한 일부분의 합이 t 이하이고, 선택한 수의 갯수가 k 이상이면 count 증가
//                if (sum <= t && selectedCount >= k) {
//                    count++;
//                }
//
//                // sum 초기화
//                sum = 0;
//            }
//        }
//
//        return count;
//    }
}

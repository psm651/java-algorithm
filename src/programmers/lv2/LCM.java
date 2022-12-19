package programmers.lv2;

import java.util.Arrays;

public class LCM {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        Arrays.sort(arr);
        int bigNum = arr[arr.length-1];
        boolean flag = true;
        int tmp = 0;
        while (flag) {
            tmp++;
            for (int i = 0; i < arr.length - 1; i++) {
                if ((bigNum * tmp) % arr[i] == 0) {
                    flag = false;
                }else {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(tmp*bigNum);
    }
}

package programmers.no13;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        boolean check = true;
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    check = true;
                    for (int l = 2; l * l <= nums[i] + nums[j] + nums[k]; l++) {
                        if ((nums[i] + nums[j] + nums[k]) % l == 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

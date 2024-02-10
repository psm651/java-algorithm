package programmers.hash;

import java.util.HashSet;
import java.util.Set;

//프로그래머스 고득점 kit Hash 1 번
public class Main1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3,3,2,2,4};
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = nums.length / 2;
        if (set.size() > count) {
            return count;
        } else {
            return set.size();
        }
    }
}

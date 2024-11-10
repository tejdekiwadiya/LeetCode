// https://leetcode.com/problems/find-closest-number-to-zero/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { -4, -2, 1, 4, 8 };
        int ans = findClosestNumber(nums);
        System.out.println(ans);
    }

    public static int findClosestNumber(int[] nums) {
        int value = 0;
        int ids = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ids = Math.abs(nums[i]);
                value = nums[i];
            } else {
                if (ids >= Math.abs(nums[i])) {
                    ids = Math.abs(nums[i]);
                    value = nums[i];
                }
            }
        }
        return value;
    }
}

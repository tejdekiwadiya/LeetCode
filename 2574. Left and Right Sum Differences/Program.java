// https://leetcode.com/problems/left-and-right-sum-differences/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[] ans = leftRightDifference(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum = nums[i - 1] + sum;
            left[i] = sum;
        }

        sum = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            sum = nums[i] + sum;
            right[i - 1] = sum;
        }

        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.abs(left[i] - right[i]);
            nums[i] = sum;
        }
        return nums;
    }
}

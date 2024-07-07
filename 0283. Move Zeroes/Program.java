// https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[counter] = nums[i];
                counter++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}

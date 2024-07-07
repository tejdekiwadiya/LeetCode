// https://leetcode.com/problems/two-sum/description/ 

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int row = 0; row < nums.length; row++) {
            int value = nums[row];
            int sum = 0;
            for (int col = row + 1; col < nums.length; col++) {
                sum = value + nums[col];
                if (target == sum) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { 0 };
    }
}

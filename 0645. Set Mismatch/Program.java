// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
            }
        }
        return new int[] { nums.length - 1, nums.length };
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}

// https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int squr = nums[i] * nums[i];
            nums[i] = squr;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }
}

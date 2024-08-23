// https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        int[] ans = pivotArray(nums, pivot);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int[] ans = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                ans[idx++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                ans[idx++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                ans[idx++] = nums[i];
            }
        }

        return ans;
    }
}

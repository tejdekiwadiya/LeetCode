// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            }
        }

        if (count == 0) {
            return new int[] { -1, -1 };
        }

        int[] arr = new int[2];
        int index = 0;
        int i = 0;
        int count_n = 0;
        for (int j = 0; j < nums.length; j++) {
            if (target == nums[j]) {
                index = j;
                count_n++;
                if (count_n == 1 || count_n == count) {
                    arr[i] = index;
                    i++;
                }
                if (count == 1) {
                    arr[i] = index;
                }
            }
        }
        return arr;
    }
}

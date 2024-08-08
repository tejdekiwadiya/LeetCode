// https://leetcode.com/problems/neither-minimum-nor-maximum/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4 };
        int ans = findNonMinOrMax(nums);
        System.out.println(ans);
    }

    public static int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        Arrays.sort(nums);
        int idx = nums.length / 2;
        return nums[idx];
    }
}
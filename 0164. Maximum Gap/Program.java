// https://leetcode.com/problems/maximum-gap/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 9, 1 };
        int ans = maximumGap(nums);
        System.out.println(ans);
    }

    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int gap = 0;
        for (int i = 1; i < nums.length; i++) {
            int minP = nums[i - 1] - nums[i];
            int min = Math.abs(minP);
            if (gap < min) {
                gap = min;
            }
        }
        return gap;
    }
}

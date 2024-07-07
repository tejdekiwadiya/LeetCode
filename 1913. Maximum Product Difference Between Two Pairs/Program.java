// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        int ans = maxProductDifference(nums);
        System.out.println(ans);
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]));
    }
}

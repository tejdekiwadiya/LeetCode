// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 7 };
        int ans = maxProduct(nums);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}

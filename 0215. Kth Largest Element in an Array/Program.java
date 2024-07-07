// https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int target = 2;
        int ans = findKthLargest(nums, target);
        System.out.println(ans);

    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = nums[nums.length - k];
        return ans;
    }
}

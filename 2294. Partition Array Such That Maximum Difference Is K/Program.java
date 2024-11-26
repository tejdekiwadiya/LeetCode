// https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/description/

import java.util.Arrays;

class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 1, 2, 5 };
        int k = 2;
        int ans = partitionArray(nums, k);
        System.out.println(ans);
    }

    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[idx] > k) {
                count++;
                idx = i;
            }
        }
        return count;
    }
}
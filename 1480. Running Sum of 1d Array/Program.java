// https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                temp = temp + nums[j];
            }
            ans[i] = temp;
        }
        return ans;
    }
}

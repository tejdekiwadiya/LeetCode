// https://leetcode.com/problems/single-number/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i] = 0;
                nums[i - 1] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return nums[i];
            }
        }
        return 0;
    }
}

// https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int ans = minIncrementForUnique(nums);
        System.out.println(ans);
    }
    public static int minIncrementForUnique(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int temp = nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
                count += temp;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/maximum-difference-between-increasing-elements/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 4 };
        int ans = maximumDifference(nums);
        System.out.println(ans);
    }

    public static int maximumDifference(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && ans < nums[j] - nums[i]) {
                    ans = nums[j] - nums[i];
                }
            }
        }
        return ans;
    }
}
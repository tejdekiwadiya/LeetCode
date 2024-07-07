// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

public class Program {
    public static void main(String[] args) {
        int[] nums = { -2, -1, -1, 1, 2, 3 };
        int ans = maximumCount(nums);
        System.out.println(ans);
    }

    public static int maximumCount(int[] nums) {
        int positive = 0;
        int negitive = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < 0) {
                positive++;
            }
            if (nums[index] > 0) {
                negitive++;
            }
        }
        return positive > negitive ? positive : negitive;
    }
}

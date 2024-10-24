// https://leetcode.com/problems/find-the-middle-index-in-array/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 3, -1, 8, 4 };
        int ans = findMiddleIndex(nums);
        System.out.println(ans);
    }

    public static int findMiddleIndex(int[] nums) {
        int left = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}
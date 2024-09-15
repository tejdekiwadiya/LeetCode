// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }

    public static int singleNonDuplicate(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }
}

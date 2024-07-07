// https://leetcode.com/problems/find-peak-element/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    public static int findPeakElement(int[] nums) {
        int value = nums[0];
        int value_index = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] > value) {
                value = nums[index];
                value_index = index;
            }
        }
        return value_index;
    }
}

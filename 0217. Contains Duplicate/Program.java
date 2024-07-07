// https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
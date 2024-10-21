// https://leetcode.com/problems/type-of-triangle/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 3 };
        String ans = triangleType(nums);
        System.out.println(ans);
    }

    public static String triangleType(int[] nums) {
        // Sort the array to make the logic clearer
        Arrays.sort(nums);

        // Check for a valid triangle first (triangle inequality)
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }

        // Check for equilateral
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        // Check for isosceles
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        }

        // If it's not equilateral or isosceles, it must be scalene
        return "scalene";
    }
}

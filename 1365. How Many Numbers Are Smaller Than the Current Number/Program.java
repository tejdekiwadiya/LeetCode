// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (value > nums[j]) {
                    count++;
                    if (value == nums[j]) {
                        count--;
                    }
                }
            }
            array[i] = count;
        }
        return array;
    }
}

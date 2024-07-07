// https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] newA = new int[nums.length];
        int mid = n;
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index % 2 == 0) {
                newA[index] = nums[count];
                count++;
            } else {
                newA[index] = nums[mid];
                mid++;
            }
        }
        return newA;
    }
}

// https://leetcode.com/problems/sort-array-by-parity/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int count = 0;
        while (i <= nums.length - 1) {
            if (nums[i] % 2 == 0) {
                count++;
                i++;
            } else {
                i++;
            }
        }

        int[] arr1 = new int[count];
        int[] arr2 = new int[nums.length - count];

        int index = 0;
        int count_arr1 = 0;
        int count_arr2 = 0;

        while (index <= nums.length - 1) {
            if (nums[index] % 2 == 0) {
                arr1[count_arr1] = nums[index];
                index++;
                count_arr1++;
            } else {
                arr2[count_arr2] = nums[index];
                index++;
                count_arr2++;
            }
        }

        int[] ans = new int[arr2.length + arr1.length];
        int[] Ans1 = arrCopy(arr1, arr2, ans);
        return Ans1;
    }

    static int[] arrCopy(int[] arr1, int[] arr2, int[] ans) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            ans[count] = arr2[j];
            count++;
        }
        return ans;
    }
}

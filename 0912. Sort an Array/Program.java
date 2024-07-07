// https://leetcode.com/problems/sort-an-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        int[] ans = sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArray(int[] nums) {
        return mergesort(nums, 0, nums.length);
    }

    static int[] mergesort(int nums[], int start, int end) {
        if (end - start == 1) {
            return nums;
        }
        int mid = (start + end) / 2;
        mergesort(nums, start, mid);
        mergesort(nums, mid, end);
        return MergeSortFunction(nums, start, mid, end);
    }

    static int[] MergeSortFunction(int[] nums, int start, int mid, int end) {
        int[] merge = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (nums[i] < nums[j]) {
                merge[k] = nums[i];
                i++;
            } else {
                merge[k] = nums[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            merge[k] = nums[i];
            k++;
            i++;
        }
        while (j < end) {
            merge[k] = nums[j];
            k++;
            j++;
        }
        for (int index = 0; index < merge.length; index++) {
            nums[start + index] = merge[index];
        }
        return nums;
    }
}

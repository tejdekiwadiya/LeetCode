// https://leetcode.com/problems/merge-sorted-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[count];
            count++;
        }
        Arrays.sort(nums1);
    }
}

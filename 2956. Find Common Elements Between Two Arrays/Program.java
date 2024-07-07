// https://leetcode.com/problems/find-common-elements-between-two-arrays/description/

import java.util.*;

public class Program {
    public static void main(String[] args) {
        int[] nums1 = { 4, 3, 2, 3, 1 };
        int[] nums2 = { 2, 2, 5, 2, 3, 6 };
        int[] ans = findIntersectionValues(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans1++;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    ans2++;
                    break;
                }
            }
        }
        return new int[] { ans1, ans2 };
    }
}

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = search(nums,target);
        System.out.println(ans);
    }

    public static boolean search(int[] nums, int target) {
        Arrays.sort(nums);
           int start = 0;
           int end = nums.length - 1;
           while (start <= end) {
               int mid = (start + end) / 2;
               if (target < nums[mid]) {
                   end = mid - 1;
               } else if (target > nums[mid]) {
                   start = mid + 1;
               } else {
                   return true;
               }
           }
           return false;
       }
}

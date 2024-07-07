//  https://leetcode.com/problems/search-insert-position/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

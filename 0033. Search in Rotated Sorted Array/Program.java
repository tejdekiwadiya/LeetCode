// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (target == nums[index]) {
                return index;
            }
        }
        return -1;
    }
}

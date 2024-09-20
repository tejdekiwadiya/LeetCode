// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5 };
        int ans = findMin(nums);
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[0];
    }
}
// https://leetcode.com/problems/find-the-duplicate-number/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        int start = 0;
        while (start < nums.length) {
            int correct = nums[start] - 1;
            if (nums[start] != nums[correct]) {
                swap(nums, start, correct);
            } else {
                start++;
            }
        }

        for (int index = 1; index <= nums.length; index++) {
            if (nums[index - 1] != index) {
                int temp = nums[index - 1] - 1;
                if (nums[index - 1] == nums[temp]) {
                    return nums[index - 1];
                }
            }
        }
        return 0;
    }

    static void swap(int[] nums, int start, int correct) {
        int temp = nums[start];
        nums[start] = nums[correct];
        nums[correct] = temp;
    }
}
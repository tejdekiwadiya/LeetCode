// https://leetcode.com/problems/missing-number/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int index, int correct) {
        int temp = nums[index];
        nums[index] = nums[correct];
        nums[correct] = temp;
    }
}

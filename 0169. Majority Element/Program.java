// https://leetcode.com/problems/majority-element

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
            }
            if (count < temp) {
                count = temp;
                ans = nums[i];
            }
        }
        return ans;
    }
}

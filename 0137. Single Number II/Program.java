// https://leetcode.com/problems/single-number-ii/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 2 };
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 0) {
                return nums[i];
            }
            count = 0;
        }
        return -1;
    }
}

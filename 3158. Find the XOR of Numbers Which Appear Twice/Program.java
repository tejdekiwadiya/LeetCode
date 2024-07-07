// https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3 };
        int ans = duplicateNumbersXOR(nums);
        System.out.println(ans);
    }

    public static int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans = ans ^ nums[i];
                    break;
                }
            }
        }
        return ans;
    }
}

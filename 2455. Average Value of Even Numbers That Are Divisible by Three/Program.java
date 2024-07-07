// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 7, 10 };
        int ans = averageValue(nums);
        System.out.println(ans);
    }

    public static int averageValue(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                ans += nums[i];
                count++;
            }
        }
        return count == 0 ? 0 : ans / count;
    }
}

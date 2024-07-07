// https://leetcode.com/problems/contains-duplicate-ii/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        boolean ans = containsNearbyDuplicate(nums, k);
        System.out.println(ans);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = Math.abs(i - j);
                if (temp > k) {
                    return false;
                }
                if (temp <= k && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

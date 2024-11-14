// https://leetcode.com/problems/minimum-distance-to-the-target-element/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        int start = 3;
        int ans = getMinDistance(nums, target, start);
        System.out.println(ans);
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int ans = 100000;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                ans = Math.min(Math.abs(i - start), ans);
            }
        }
        return ans;
    }
}
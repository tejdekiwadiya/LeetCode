// https://leetcode.com/problems/count-special-quadruplets/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 6 };
        int ans = countQuadruplets(nums);
        System.out.println(ans);
    }

    public static int countQuadruplets(int[] nums) {
        int ans = 0;
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    for (int d = c + 1; d < nums.length; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}

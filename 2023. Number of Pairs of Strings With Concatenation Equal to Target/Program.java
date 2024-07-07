// https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/description/

public class Program {
    public static void main(String[] args) {
        String[] nums = { "123", "4", "12", "34" };
        String target = "1234";
        int ans = numOfPairs(nums, target);
        System.out.println(ans);
    }

    public static int numOfPairs(String[] nums, String target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    String temp = nums[i] + nums[j];
                    if (temp.equals(target)) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

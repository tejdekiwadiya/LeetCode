// https://leetcode.com/problems/keep-multiplying-found-values-by-two/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 6, 1, 12 };
        int original = 3;
        int ans = findFinalValue(nums, original);
        System.out.println(ans);
    }

    public static int findFinalValue(int[] nums, int original) {
        int result = original;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == result) {
                result = result * 2;
                i = 0;
            } else {
                i++;
            }
        }
        return result;
    }
}

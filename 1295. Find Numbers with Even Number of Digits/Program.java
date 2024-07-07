// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            String v = Integer.toString(val);
            if (v.length() % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}

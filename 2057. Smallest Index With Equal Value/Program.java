// // https://leetcode.com/problems/smallest-index-with-equal-value/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2 };
        int ans = smallestEqual(nums);
        System.out.println(ans);
    }

    public static int smallestEqual(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i % 10) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

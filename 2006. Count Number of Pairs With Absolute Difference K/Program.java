// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 4 };
        int k = 2;
        int ans = countKDifference(nums, k);
        System.out.println(ans);
    }

    public static int countKDifference(int[] nums, int k) {
        int i = 0;
        int count = 0;
        while (i < nums.length) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int temp = nums[i] - nums[j];
                    if (temp == k) {
                        count++;
                    }
                }
            }
            i++;
        }
        return count;
    }
}

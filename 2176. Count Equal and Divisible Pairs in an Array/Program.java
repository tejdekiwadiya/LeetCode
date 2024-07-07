// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
        int k = 2;
        int ans = countKDifference(nums, k);
        System.out.println(ans);
    }

    public static int countKDifference(int[] nums, int k) {
        if (k == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int num = i * j;
                    if (num % k == 0) {
                        count++;
                    }
                }
            }   
        }
        return count;
    }
}

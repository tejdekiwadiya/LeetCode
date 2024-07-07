// https://leetcode.com/problems/contains-duplicate-iii/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int indexDiff = 3;
        int valueDiff = 0;
        boolean ans = containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        System.out.println(ans);
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums.length >= 99997) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = Math.abs(i - j);
                int valueDi = Math.abs(nums[i] - nums[j]);
                if (i != j) {
                    if (temp <= indexDiff) {
                        if (valueDi <= valueDiff) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

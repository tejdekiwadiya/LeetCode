// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 9, 10 };
        int ans = findGCD(nums);
        System.out.println(ans);
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int GCD = 1;
        for (int index = 2; index <= nums[nums.length - 1]; index++) {
            if (nums[0] % index == 0 && nums[nums.length - 1] % index == 0) {
                GCD = index;
            }
        }
        return GCD;
    }
}

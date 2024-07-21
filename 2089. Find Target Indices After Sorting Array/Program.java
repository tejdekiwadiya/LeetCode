// https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }
        return ans;
    }
}
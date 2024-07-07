// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (int index = 1; index <= nums.length; index++) {
            if (nums[index - 1] != index) {
                int temp = nums[index - 1] - 1;
                if (nums[index - 1] == nums[temp])
                    ;
                ans.add(nums[index - 1]);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int start, int correct) {
        int temp = nums[start];
        nums[start] = nums[correct];
        nums[correct] = temp;
    }
}

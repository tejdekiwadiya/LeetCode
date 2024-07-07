// https://leetcode.com/problems/third-maximum-number/description/

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 4, 3, 4, 3, 0, 3, 3 };
        int ans = thirdMax(nums);
        System.out.println(ans);
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        nums[j] = -100000;
                    }
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -100000) {
                list.add(nums[i]);
            }
        }

        if (list.size() <= 2) {
            return list.size() == 2 ? list.get(1) : list.get(0);
        }
        return list.get(list.size() - 3);
    }
}

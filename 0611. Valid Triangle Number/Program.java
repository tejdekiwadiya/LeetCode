// https://leetcode.com/problems/valid-triangle-number/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4};
        int ans = triangleNumber(nums);
        System.out.println(ans);
    }

     public static int triangleNumber(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k]) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }    
}
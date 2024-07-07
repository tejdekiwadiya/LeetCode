// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        int ans = countPairs(nums, target);
        System.out.println(ans);
    }

    public static int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int temp = nums.get(i) + nums.get(j);
                if (temp < target) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

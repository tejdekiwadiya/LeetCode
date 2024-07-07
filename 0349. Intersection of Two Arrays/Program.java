// https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 1, 2 };
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                }
            }
        }

        int[] dup_ans = new int[list.size()];
        for (int i = 0; i < dup_ans.length; i++) {
            dup_ans[i] = list.get(i);
        }

        Arrays.sort(dup_ans);
        for (int i = 1; i < dup_ans.length; i++) {
            if (dup_ans[i - 1] == dup_ans[i]) {
                dup_ans[i - 1] = -1;
            }
        }

        ArrayList<Integer> ans_list = new ArrayList<Integer>();
        for (int i = 0; i < dup_ans.length; i++) {
            if (dup_ans[i] != -1) {
                ans_list.add(dup_ans[i]);
            }
        }

        int[] ans = new int[ans_list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ans_list.get(i);
        }
        return ans;
    }
}

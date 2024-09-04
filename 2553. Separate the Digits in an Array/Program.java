// https://leetcode.com/problems/separate-the-digits-in-an-array/description/

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int[] ans = separateDigits(nums);
        System.out.println(Arrays.toString(ans));
    }

    // Method - 01: using string converstion
    public static int[] separateDigits(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            String num = String.valueOf(nums[i++]);
            int l = 0;
            while (l < num.length()) {
                list.add(String.valueOf(num.charAt(l++)));
            }
        }

        int[] ans = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            ans[i] = Integer.parseInt(list.get(i));
        }
        return ans;
    }

    // Method - 02: using only int and arrayList
    // public static int[] separateDigits(int[] nums) {
    // ArrayList<Integer> list = new ArrayList<>();
    // int i = nums.length - 1;
    // while (i >= 0) {
    // int num = nums[i--];
    // while (num > 0) {
    // list.add(num % 10);
    // num = num / 10;
    // }
    // }

    // int[] ans = new int[list.size()];
    // int id = 0;
    // for (i = list.size() - 1; i >= 0; i--) {
    // ans[id++] = list.get(i);
    // }
    // return ans;
    // }
}

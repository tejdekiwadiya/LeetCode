// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] pref = { 5, 2, 0, 3, 1 };
        int[] ans = findArray(pref);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findArray(int[] pref) {
        int[] new_array = new int[pref.length];

        for (int i = 0; i < pref.length; i++) {
            if (i == 0)
                new_array[0] = pref[0];
            else {
                new_array[i] = pref[i - 1] ^ pref[i];
            }
        }

        return new_array;
    }
}

// https://leetcode.com/problems/convert-1d-array-into-2d-array/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int m = 1;
        int n = 3;
        int[][] ans = construct2DArray(nums, m, n);
        System.out.print(Arrays.deepToString(ans));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] ans = new int[m][n];
        int id = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = original[id++];
            }
        }

        return ans;
    }
}

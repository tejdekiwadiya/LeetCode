// https://leetcode.com/problems/transpose-matrix/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.toString(ans));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}

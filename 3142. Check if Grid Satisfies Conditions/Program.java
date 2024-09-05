// https://leetcode.com/problems/check-if-grid-satisfies-conditions/description/

public class Program {
    public static void main(String[] args) {
        int[][] grid = { { 1, 0, 2 }, { 1, 0, 2 } };
        boolean ans = satisfiesConditions(grid);
        System.out.println(ans);
    }

    public static boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                if (grid[i][j] == grid[0][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}

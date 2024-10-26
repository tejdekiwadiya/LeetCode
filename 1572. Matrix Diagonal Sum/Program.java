// https://leetcode.com/problems/matrix-diagonal-sum/description/

public class Program {
    public static void main(String[] args) {
        int[][] mat = {
                { 7, 9, 8, 6, 3 },
                { 3, 9, 4, 5, 2 },
                { 8, 1, 10, 4, 10 },
                { 9, 5, 10, 9, 6 },
                { 7, 2, 4, 10, 8 }
        };
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        if (mat.length > 1) {
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][mat.length - i - 1];
            }
            if (mat.length % 2 == 1) {
                return sum - mat[(mat.length - 1) / 2][(mat.length - 1) / 2];
            }
        }
        return sum;
    }
}

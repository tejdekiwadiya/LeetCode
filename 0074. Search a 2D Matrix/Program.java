// https://leetcode.com/problems/search-a-2d-matrix/description/

public class Program {

    public static void main(String[] args) {
        int[][] matrix = {{ 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 }};
        int target = 3;
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (target == matrix[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }
}

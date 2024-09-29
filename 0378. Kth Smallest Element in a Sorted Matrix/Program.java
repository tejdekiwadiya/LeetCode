// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int ans = kthSmallest(matrix, k);
        System.out.println(ans);
    }
    public static int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        list.sort((a, b) -> {
            return -1 * b.compareTo(a);
        });
        return k > list.size() + 1 ? 0 : list.get(k - 1);
    }
}

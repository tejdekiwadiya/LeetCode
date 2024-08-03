// https://leetcode.com/problems/root-equals-sum-of-children/

public class Program {
    public static boolean checkTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        int ans = root.left.val + root.right.val;
        boolean check = ans == root.val;
        return check;
    }
}

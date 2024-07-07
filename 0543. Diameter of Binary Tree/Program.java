// https://leetcode.com/problems/diameter-of-binary-tree/

public class Program {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int diameter1 = diameterOfBinaryTree(root.left);
        int diameter2 = diameterOfBinaryTree(root.right);
        int diameter3 = height(root.left) + height(root.right);
        int Max = diameter1 > diameter2 ? diameter1 : diameter2;
        return Max > diameter3 ? Max : diameter3;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return left > right ? left + 1 : right + 1;
    }
}

// https://leetcode.com/problems/search-in-a-binary-search-tree/

public class Program {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (root.val == val) {
            return root;
        }

        if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
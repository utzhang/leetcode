package org.utz.offer;

public class Pb052IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        dfs(root, dummy);
        return dummy.right;
    }

    private TreeNode dfs(TreeNode root, TreeNode prev) {
        if (root == null) {
            return prev;
        }
        TreeNode leftLeaf = dfs(root.left, prev);
        leftLeaf.right = root;
        root.left = null;
        TreeNode rightLeaf = dfs(root.right, root);
        return rightLeaf;
    }
}

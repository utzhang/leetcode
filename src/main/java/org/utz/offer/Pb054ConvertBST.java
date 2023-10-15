package org.utz.offer;

public class Pb054ConvertBST {
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        int rightSum = dfs(root.right, sum);
        root.val = rightSum + root.val;
        int leftSum = dfs(root.left, root.val);
        return leftSum;
    }
}

package org.utz.offer;

public class Pb051MaxPathSum {
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        dfs(root, maxSum);
        return maxSum[0];
    }

    // 返回值为当前节点到叶子结点路径的最大值
    private int dfs(TreeNode root, int[] maxSum) {
        if (root == null) {
            return 0;
        }

        int[] maxSumLeft = new int[]{Integer.MIN_VALUE};
        int left = Math.max(0, dfs(root.left, maxSumLeft));

        int[] maxSumRight = new int[]{Integer.MIN_VALUE};
        int right = Math.max(0, dfs(root.right, maxSumRight));

        maxSum[0] = Math.max(maxSumLeft[0], maxSumRight[0]);
        maxSum[0] = Math.max(maxSum[0], left + right + root.val);
        return root.val + Math.max(left, right);
    }
}

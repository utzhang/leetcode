package org.utz.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pb044LargestValues {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> results = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return results;
        }

        queue.offer(root);
        int curNodeCount = 1;
        while (!queue.isEmpty()) {
            int maxValueCurLevel = Integer.MIN_VALUE;
            int nextNodeCount = 0;
            while (curNodeCount > 0) {
                TreeNode curNode = queue.poll();
                maxValueCurLevel = Math.max(maxValueCurLevel, curNode.val);
                curNodeCount--;
                if (curNode.left != null) {
                    nextNodeCount++;
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    nextNodeCount++;
                    queue.offer(curNode.right);
                }
            }
            results.add(maxValueCurLevel);
            curNodeCount = nextNodeCount;

        }
        return results;
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

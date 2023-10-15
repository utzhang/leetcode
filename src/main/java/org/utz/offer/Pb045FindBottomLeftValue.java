package org.utz.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Pb045FindBottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> curLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();
        int bottomLeft = root.val;
        curLevel.offer(root);
        while (!curLevel.isEmpty()) {
            TreeNode node = curLevel.poll();

            if (node.left != null) {
                nextLevel.offer(node.left);
            }

            if (node.right != null) {
                nextLevel.offer(node.right);
            }

            if (curLevel.isEmpty()) {
                curLevel = nextLevel;
                nextLevel = new LinkedList<>();
                if (!curLevel.isEmpty()) {
                    bottomLeft = curLevel.peek().val;
                }
            }

        }
        return bottomLeft;
    }
}

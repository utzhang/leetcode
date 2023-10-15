package org.utz.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pb046RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new LinkedList<>();

        Queue<TreeNode> curLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();
        if (root != null) {
            curLevel.offer(root);
        }
        while (!curLevel.isEmpty()) {
            TreeNode node = curLevel.poll();
            if (node.left != null) {
                nextLevel.offer(node.left);
            }
            if (node.right != null) {
                nextLevel.offer(node.right);
            }

            if (curLevel.isEmpty()) {
                view.add(node.val);
                curLevel = nextLevel;
                nextLevel = new LinkedList<>();
            }
        }
        return view;
    }
}

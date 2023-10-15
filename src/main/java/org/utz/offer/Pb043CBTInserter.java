package org.utz.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Pb043CBTInserter {

    private Queue<TreeNode> queue;
    private TreeNode root;


    public Pb043CBTInserter(TreeNode root) {
        this.queue = new LinkedList<>();
        this.root = root;
        queue.offer(root);
        while (queue.peek().left != null && queue.peek().right != null) {
            TreeNode curNode = queue.poll();
            queue.offer(curNode.left);
            queue.offer(curNode.right);
        }
    }

    public int insert(int v) {
        TreeNode curNode = queue.peek();
        if (curNode.left == null) {
            curNode.left = new TreeNode(v);
            return curNode.val;
        }

        curNode.right = new TreeNode(v);
        queue.poll();
        queue.offer(curNode.left);
        queue.offer(curNode.right);
        return curNode.val;
    }

    public TreeNode get_root() {
        return this.root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

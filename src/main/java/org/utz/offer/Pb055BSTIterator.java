package org.utz.offer;

import java.util.LinkedList;
import java.util.Stack;

public class Pb055BSTIterator {

    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur;

    public Pb055BSTIterator(TreeNode root) {
        cur = root;
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        TreeNode node = stack.pop();
        cur = node.right;
        return node.val;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}

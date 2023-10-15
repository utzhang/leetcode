package org.utz.offer;

import java.util.Stack;

public class Pb053InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        boolean found = false;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (found) {
                break;
            }
            if (p == cur) {
                found = true;
            }
            cur = cur.right;
        }
        return cur;
    }

}

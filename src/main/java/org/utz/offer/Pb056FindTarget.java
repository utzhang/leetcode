package org.utz.offer;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Pb056FindTarget {
    private Stack<TreeNode> stack = new Stack<>();
    private Set<Integer> set = new HashSet<>();
    private TreeNode cur;
    public boolean findTarget(TreeNode root, int k) {
        cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            if (set.contains(k - node.val)) {
                return true;
            }
            set.add(node.val);
            cur = node.right;
        }
        return false;
    }
}

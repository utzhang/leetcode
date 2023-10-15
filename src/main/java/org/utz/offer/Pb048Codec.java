package org.utz.offer;

public class Pb048Codec {
    // 先序遍历
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodeStrs = data.split(",");
        int[] index = new int[]{0};
        return dfs(nodeStrs, index);


    }

    private TreeNode dfs(String[] nodeStrs, int[] index) {
        if ("#".equals(nodeStrs[index[0]])) {
            index[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodeStrs[index[0]]));
        index[0]++;
        node.left = dfs(nodeStrs, index);
        node.right = dfs(nodeStrs, index);
        return node;
    }
}

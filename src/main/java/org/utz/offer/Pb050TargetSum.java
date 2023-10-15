package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb050TargetSum {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        Map<Long, Integer> pathToCount = new HashMap<>();
        pathToCount.put(0l, 1);
        int path = 0;
        return dfs(root, path, pathToCount, targetSum);
    }

    private int dfs(TreeNode root, long path, Map<Long, Integer> pathToCount, int targetSum) {
        if (root == null) {
            return 0;
        }
        path = path + root.val;
        int count = pathToCount.getOrDefault(path - targetSum, 0);
        pathToCount.put(path, pathToCount.getOrDefault(path, 0) + 1);
        count += dfs(root.left, path, pathToCount, targetSum);
        count += dfs(root.right, path, pathToCount, targetSum);
        pathToCount.put(path, pathToCount.get(path) + 1);
        return count;
    }
}

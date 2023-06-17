package org.utz.offer;

public class Pb088MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length < 2) {
            return 0;
        }
        int height = cost.length;
        int[] sum = new int[height];
        sum[0] = cost[0];
        sum[1] = cost[1];

        for (int i = 2; i < height; i++) {
            sum[i] = Math.min(sum[i - 2], sum[i - 1]) + cost[i];
        }
        return Math.min(sum[height - 1], sum[height - 2]);
    }
}

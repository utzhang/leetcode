package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb010SubArraySum {
    public int subarraySum(int[] nums, int k) {
        // [i, j]连续子数组的和 = sum[j] - sum[i] = k
        // sum[i] = sum[j] - k
        // 找出sum[i] 出现的次数 即可

        int sum = 0;
        int count = 0;
        Map<Integer, Integer> sumToCountMap = new HashMap<>();
        sumToCountMap.put(0, 1);
        for (int num : nums) {
            sum += num;
            count += sumToCountMap.getOrDefault(sum - k, 0);
            sumToCountMap.put(sum, sumToCountMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

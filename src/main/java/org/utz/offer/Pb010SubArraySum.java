package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb010SubArraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumToCountMap = new HashMap<>();
        sumToCountMap.put(0, 1);

        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            count += sumToCountMap.getOrDefault(sum - k, 0);
            sumToCountMap.put(sum, sumToCountMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

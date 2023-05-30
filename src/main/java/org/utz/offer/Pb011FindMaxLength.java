package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb011FindMaxLength {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);
        int sum = 0;
        int maxlength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sumToIndex.containsKey(sum)) {
                maxlength = Math.max(i - sumToIndex.get(sum), maxlength);
            } else {
                sumToIndex.put(sum, i);
            }
        }
        return maxlength;
    }
}

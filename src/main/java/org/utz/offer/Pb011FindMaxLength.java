package org.utz.offer;

import com.sun.crypto.provider.HmacMD5KeyGenerator;

import java.util.HashMap;
import java.util.Map;

public class Pb011FindMaxLength {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sumToIndex.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumToIndex.get(sum));
            } else {
                sumToIndex.put(sum, i);
            }
        }
        return maxLength;
    }
}

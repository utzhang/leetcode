package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb057ContainsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> buckets = new HashMap<>();
        int bucketSize = t + 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int id = getBucketId(num, bucketSize);
            if (buckets.containsKey(id)
                    || (buckets.containsKey(id - 1) && buckets.get(id - 1) + t >= num)
                    || (buckets.containsKey(id + 1) && buckets.get(id + 1) - t <= num)) {
                return true;
            }
            buckets.put(id, num);
            if (i >= k) {
                buckets.remove(getBucketId(nums[i - k], bucketSize));
            }
        }
        return false;
    }

    private int getBucketId(int num, int bucketSize) {
        return num >= 0 ? num / bucketSize : (num + 1) / bucketSize - 1;
    }
}

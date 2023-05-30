package org.utz.offer;

public class Pb012PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
            if (sum2 - nums[i] == sum - sum2) {
                return i;
            }
        }
        return -1;
    }
}

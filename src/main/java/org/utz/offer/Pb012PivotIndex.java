package org.utz.offer;

public class Pb012PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum2 * 2 == sum - nums[i]) {
                return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }
}

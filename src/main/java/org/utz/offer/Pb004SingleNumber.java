package org.utz.offer;

public class Pb004SingleNumber {
    public int singleNumber(int[] nums) {
        int[] sum = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = 0; j < 32; j++) {
                sum[32 - j - 1] +=  current >> j & 1;
            }
        }
        int res = 0;
        for (int i = 0; i < sum.length; i++) {
            res = (res << 1) + sum[i] % 3;
        }
        return res ;
    }
}

package org.utz.offer;

public class Pb004SingleNumber {
    // 数组nums中只有一个整数只出现一次，其他整数都出现三次，找出那个只出现一次的整数
    public int singleNumber(int[] nums) {
        // 创建一个整数整数数组，长度为32(整数位数为32)
        int[] count = new int[32];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                count[count.length - 1 - j] = (nums[i] >> j & 1) + count[count.length - 1 - j];
            }
        }

        // 增加之后，需要/3
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] % 3;
        }

        // 计算count数组表示的整数
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            sum = (sum << 1) + count[i];
        }
        return sum;
    }
}

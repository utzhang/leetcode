package org.utz.offer;

public class Pb003CountBits {
    // 输入n， 返回长度为n的数组，数组的下标i对应的值为i的二进制形式中1的数量
    // 可以用动态规划，res[i] = res[i & i - 1]
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            res[i] = res[i & i - 1] + 1;
        }
        return res;
    }
}

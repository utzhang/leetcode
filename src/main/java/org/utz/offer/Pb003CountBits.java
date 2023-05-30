package org.utz.offer;

public class Pb003CountBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // i & i - 1 将i的二进制表示的最右一位1置为0
            res[i] = res[i & i - 1] + 1;
        }
        return res;
    }
}

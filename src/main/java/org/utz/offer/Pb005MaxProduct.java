package org.utz.offer;

public class Pb005MaxProduct {
    public int maxProduct(String[] words) {
        int[] flags = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                flags[i] |= 1 << (c - 'a');
            }
        }

        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if ((flags[i] & flags[j]) == 0) {
                    int product = words[i].length() * words[j].length();
                    res = Math.max(res, product);
                }
            }
        }
        return res;
    }
}

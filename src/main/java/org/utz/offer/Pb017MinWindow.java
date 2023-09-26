package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb017MinWindow {
    /**
     * s 和 t由英文组成
     * s 包含 t
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        Map<Character, Integer> chToCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            chToCount.put(c, chToCount.getOrDefault(c, 0) + 1);
        }
        int count = chToCount.size();
        int minLength = Integer.MAX_VALUE;
        int left = 0,minLeft=0,minRight=0;
        for (int right = 0; right < s.length(); right++) {
            if (chToCount.containsKey(s.charAt(right))) {
                // 可能会减到负数
                chToCount.put(s.charAt(right), chToCount.get(s.charAt(right)) - 1);
                if (chToCount.get(s.charAt(right)) == 0) {
                    count--;
                }
            }
            while (count == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                    minRight = right;
                }
                if (chToCount.containsKey(s.charAt(left))) {
                    chToCount.put(s.charAt(left), chToCount.get(s.charAt(left)) + 1);
                    if (chToCount.get(s.charAt(left)) == 1) {
                        count++;
                    }
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight + 1);
    }

}

package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb017MinWindow {
    /**
     * s 和 t由英文组成
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) + 1);
        }
        int minLeft = 0;
        int minRight = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            if (count.containsKey(s.charAt(right))) {
                count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) - 1);
            }

            while  (isAllValueZero(count)) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                    minRight = right;
                }
                if (count.containsKey(s.charAt(left))) {
                    count.put(s.charAt(left), count.get(s.charAt(left)) + 1);
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight + 1);
    }

    private boolean isAllValueZero(Map<Character, Integer> count) {
        for (Integer value : count.values()) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }
}

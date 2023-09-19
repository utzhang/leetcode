package org.utz.offer;

public class Pb016LengthOfLongestSubstring {
    /**
     *
     * @param s 字符串
     * @return s 中字符不重复的最长子串的长度
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int[] count = new int[256];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right)]++;
            while (count[s.charAt(right)] == 2) {
                count[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

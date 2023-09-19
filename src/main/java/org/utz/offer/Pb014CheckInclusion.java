package org.utz.offer;

public class Pb014CheckInclusion {
    // 判断s2是否包含s1的变位词
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        // s1 和 s2 仅包含小写字母
        int[] countMap = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            countMap[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length() - 1; i++) {
            countMap[s2.charAt(i) - 'a']--;
        }
        for (int j = s1.length() - 1; j < s2.length(); j++) {
            countMap[s2.charAt(j) - 'a']--;
            if (allValueZero(countMap)) {
                return true;
            }
            countMap[s2.charAt(j - s1.length() + 1) - 'a']++;
        }
        return false;
    }

    private boolean allValueZero(int[] countMap) {
        for (int num : countMap) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}

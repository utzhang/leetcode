package org.utz.offer;

import java.util.ArrayList;
import java.util.List;

public class Pb015FindAnagrams {
    // findAnagrams
    // 在找出s中是p的变位词的字符串
    // 返回子串的开始索引
    // s 和 p 仅由小写字母组成
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) {
            return res;
        }

        int[] count = new int[26];

        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }

        if (isAnagrams(count)) {
            res.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            count[s.charAt(i - p.length()) - 'a']++;
            count[s.charAt(i) - 'a']--;
            if (isAnagrams(count)) {
                res.add(i - p.length() + 1);
            }
        }
        return res;
    }

    private boolean isAnagrams(int[] count) {
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}

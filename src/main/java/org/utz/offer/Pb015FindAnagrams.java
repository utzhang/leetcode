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
        if (isAllValueZero(count)) {
            res.add(0);
        }
        int left = 0;
        for (int right = p.length(); right < s.length(); right++) {
            count[s.charAt(left) - 'a']++;
            left++;
            count[s.charAt(right) - 'a']--;
            if (isAllValueZero(count)) {
                res.add(left);
            }
        }
        return res;
    }

    private boolean isAllValueZero(int[] count) {
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public class Pb015FindAnagrams2 {
        // 变量名和注释清晰易懂
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();

            // 判断 s 和 p 长度的关系
            if (s.length() < p.length()) {
                return result;
            }

            // 统计 p 中各个字符出现的次数
            int[] pCount = new int[26];
            for (int i = 0; i < p.length(); i++) {
                pCount[p.charAt(i) - 'a']++;
            }

            // 初始化滑动窗口中各个字符出现的次数
            int[] windowCount = new int[26];
            for (int i = 0; i < p.length(); i++) {
                windowCount[s.charAt(i) - 'a']++;
            }

            // 判断初始化的滑动窗口是否为 p 的变位词
            if (isAnagram(pCount, windowCount)) {
                result.add(0);
            }

            // 滑动窗口扫描 s 字符串
            for (int i = p.length(); i < s.length(); i++) {
                // 左边界右移，更新滑动窗口的各个字符出现的次数
                windowCount[s.charAt(i - p.length()) - 'a']--;
                windowCount[s.charAt(i) - 'a']++;

                // 判断更新后的滑动窗口是否为 p 的变位词
                if (isAnagram(pCount, windowCount)) {
                    result.add(i - p.length() + 1);
                }
            }

            return result;
        }

        // 判断两个数组是否完全相同
        private boolean isAnagram(int[] pCount, int[] windowCount) {
            for (int i = 0; i < 26; i++) {
                if (pCount[i] != windowCount[i]) {
                    return false;
                }
            }
            return true;
        }
    }

}

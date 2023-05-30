package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb16LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        Pb016LengthOfLongestSubstring pb = new Pb016LengthOfLongestSubstring();
        assertEquals(3, pb.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, pb.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, pb.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, pb.lengthOfLongestSubstring(""));
    }
}
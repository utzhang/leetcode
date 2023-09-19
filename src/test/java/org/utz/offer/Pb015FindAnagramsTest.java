package org.utz.offer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Pb015FindAnagramsTest {

    @Test
    void findAnagrams() {
        Pb015FindAnagrams pb = new Pb015FindAnagrams();
        List<Integer> anagrams = pb.findAnagrams("cbaebabacd", "abc");
        int[] nums = new int[]{0, 6};
        for (int i = 0; i < nums.length; i++) {
            assertEquals(anagrams.get(i), nums[i]);
        }
    }
}
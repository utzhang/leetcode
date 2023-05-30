package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb019ValidPalindromeTest {

    @Test
    void validPalindrome() {
        Pb019ValidPalindrome pb = new Pb019ValidPalindrome();
        assertTrue(pb.validPalindrome("abca"));
    }
}
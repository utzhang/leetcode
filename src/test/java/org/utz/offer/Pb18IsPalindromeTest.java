package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb18IsPalindromeTest {

    @Test
    void isPalindrome() {
        Pb018IsPalindrome pb = new Pb018IsPalindrome();
        assertTrue(pb.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb027IsPalindromeTest {

    @Test
    void isPalindrome() {
        ListNode node = ListNode.getListNode(new int[]{1, 2, 3, 2, 1});
        Pb027IsPalindrome pb = new Pb027IsPalindrome();
        assertTrue(pb.isPalindrome(node));
    }
}
package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb005MaxProductTest {

    @Test
    void maxProduct() {
        Pb005MaxProduct pb = new Pb005MaxProduct();
        assertEquals(16, pb.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "fxyz", "abcdef"}));
        assertEquals(4, pb.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        assertEquals(0, pb.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}
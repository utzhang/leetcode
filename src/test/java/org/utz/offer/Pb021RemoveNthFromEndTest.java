package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb021RemoveNthFromEndTest {

    @Test
    void removeNthFromEnd() {
        // [1,2,3,4,5]
        ListNode listNode = ListNode.getListNode(new int[]{1, 2, 3, 4, 5});
        Pb021RemoveNthFromEnd pb = new Pb021RemoveNthFromEnd();
        ListNode result = pb.removeNthFromEnd(listNode, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
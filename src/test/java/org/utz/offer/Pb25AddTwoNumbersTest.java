package org.utz.offer;

import org.junit.jupiter.api.Test;

class Pb25AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        Pb025AddTwoNumbers pb = new Pb025AddTwoNumbers();
        ListNode l1 = ListNode.getListNode(new int[]{7, 2, 4, 3});
        ListNode l2 = ListNode.getListNode(new int[]{5, 6, 4});
        ListNode node = pb.addTwoNumbers(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }


    }
}
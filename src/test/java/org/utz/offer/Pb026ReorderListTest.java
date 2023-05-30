package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb026ReorderListTest {

    @Test
    void reorderList() {
        ListNode node = ListNode.getListNode(new int[]{1, 2, 3, 4, 5});
        Pb026ReorderList pb = new Pb026ReorderList();
        pb.reorderList(node);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
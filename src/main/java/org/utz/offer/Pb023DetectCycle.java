package org.utz.offer;

public class Pb023DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode inLoop = getNodeInloop(head);
        if (inLoop == null) {
            return null;
        }
        ListNode node = head;
        while (node != inLoop) {
            node = node.next;
            inLoop = inLoop.next;
        }
        return node;

    }

    private ListNode getNodeInloop(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return null;
    }
}

package org.utz.offer;

public class Pb021RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int step = 0;
        ListNode fast = head;
        ListNode slow = dummy;
        while (fast != null) {
            fast = fast.next;
            step++;
            if (step > n) {
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

}

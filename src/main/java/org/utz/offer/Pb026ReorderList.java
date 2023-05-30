package org.utz.offer;

public class Pb026ReorderList {
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = reverseList(slow.next);
        slow.next = null;
        reorderTwoList(head, mid);
    }

    private void reorderTwoList(ListNode head, ListNode mid) {
        ListNode front = head;
        ListNode dummy = new ListNode(0);
        while (front != null && mid != null) {
            dummy.next = front;
            front = front.next;

            dummy.next.next = mid;
            mid = mid.next;

            dummy = dummy.next.next;
        }
        if (front != null) {
            dummy.next = front;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

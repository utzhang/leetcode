package org.utz.offer;

public class Pb025AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = reverseList(l1);
        ListNode rl2 = reverseList(l2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while (rl1 != null || rl2 != null || carry != 0) {
            int sum =  carry;
            if (rl1 != null) {
                sum += rl1.val;
                rl1 = rl1.next;
            }
            if (rl2 != null) {
                sum += rl2.val;
                rl2 = rl2.next;
            }
            int cur = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(cur);
            temp.next = node;
            temp = temp.next;

        }
        return reverseList(dummy.next);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        prev.next = null;
        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}

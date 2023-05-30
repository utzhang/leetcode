package org.utz.offer;


public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNode(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy;
        for (int i = 0; i < nums.length; i++) {
            ListNode cur = new ListNode(nums[i]);
            p1.next = cur;
            p1 = p1.next;
        }
        return dummy.next;
    }
}

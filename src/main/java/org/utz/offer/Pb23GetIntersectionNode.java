package org.utz.offer;

public class Pb23GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointA = headA;
        int lengthA = 0;
        while (pointA != null) {
            lengthA++;
            pointA = pointA.next;
        }
        ListNode pointB = headB;
        int lengthB = 0;
        while (pointB != null) {
            lengthB++;
            pointB = pointB.next;
        }

        int diff = lengthA > lengthB ? lengthA - lengthB : lengthB - lengthA;
        ListNode longList = lengthA > lengthB ? headA : headB;
        ListNode shortList = lengthA > lengthB ? headB : headA;
        return getFirstIntersectionNode(longList, shortList, diff);
    }

    public ListNode getFirstIntersectionNode(ListNode longList, ListNode shortList, int diff) {

        int step = 0;
        while (step < diff && longList != null) {
            longList = longList.next;
            step++;
        }

        while (longList != null && shortList != null) {
            if (longList == shortList) {
                return shortList;
            }
            longList = longList.next;
            shortList = shortList.next;
        }

        return null;
    }
}

package org.utz.offer;

public class Pb029Insert {
    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    public Node insert(Node head, int insertVal) {
        Node insert = new Node(insertVal);
        if (head == null) {
            insert.next = insert;
            return insert;
        }

        Node min = null;
        Node max = null;
        Node pointer = head.next;

        while (pointer != head && pointer.val <= pointer.next.val) {
            max = pointer;
            min = pointer.next;
            pointer = pointer.next;
        }

        if (insertVal <= min.val || insertVal >= max.val) {
           max.next = insert;
            insert.next = min;
        }

        if (insertVal > min.val && insertVal < max.val) {
            insertToList(min, insert);
        }
        return head;
    }

    private void insertToList(Node min, Node insert) {
        Node pointer = min;
        while (pointer.val < insert.val && pointer.next.val < insert.val) {
            pointer = pointer.next;
        }
        Node next = pointer.next;
        pointer.next = insert;
        insert.next = next;
    }
}

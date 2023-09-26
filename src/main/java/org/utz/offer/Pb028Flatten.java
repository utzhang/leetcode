package org.utz.offer;

public class Pb028Flatten {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flaten(Node head) {
        flattenAndGetTail(head);
        return head;
    }

    // 将Node中的child扁平化，并返回链表的最后一个节点
    private Node flattenAndGetTail(Node head) {
        Node current = head;
        Node tail = null;
        while (current != null) {
            Node next = current.next;
            if (current.child != null) {
                Node child = current.child;
                Node childTail = flattenAndGetTail(child);
                current.next = child;
                current.child = null;
                child.prev = current;
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }
                tail = childTail;
            }else {
                tail =current;
            }
            current = next;
        }
        return tail;
    }
}

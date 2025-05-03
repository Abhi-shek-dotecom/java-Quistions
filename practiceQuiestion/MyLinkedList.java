package DataStructure.practiceQuiestion;

import javax.xml.crypto.Data;

public class MyLinkedList {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static int size(ListNode head) {
        int size  = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static void printListRecursive(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.data + " -> ");
        printListRecursive(head.next);
    }

    public static ListNode buildList() {
        ListNode head = new ListNode(10);
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(40);
        ListNode n4 = new ListNode(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return head;
    }

    public static ListNode addFirst(ListNode head, int data) {
        ListNode nn = new ListNode(data);
        nn.next = head;
        return nn;
    }

    public static ListNode addLast(ListNode head, int data) {
        if (head == null)
            return addFirst(head, data);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
        return head;
    }

    public static ListNode deleteFirst(ListNode head) {
        if (head == null)
            throw new NullPointerException("Not enough data");
        System.out.println("Deleted data = " + head.data);
        return head.next;
    }

    public static ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null)
            return deleteFirst(head);
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.next.data);
        temp.next = null;
        return head;

    }
    public static ListNode add(ListNode head, int data, int index) {
        if (index == 0)
            return addFirst(head, data);
        int size = size(head);
        if(index < 0  || index > size)
            throw new IndexOutOfBoundsException("for length: " + size);
        ListNode temp = head;
        ListNode nn = new ListNode(data);
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = buildList();
        head = deleteFirst(head);
        printList(head);


    }
}

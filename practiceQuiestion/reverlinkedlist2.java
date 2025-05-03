package DataStructure.practiceQuiestion;


//public class ListNode {
//    int data;
//    ListNode next;
//
//    ListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class reverlinkedlist2 {
    public static ListNode revers(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        System.out.println(dummy.data);
        dummy.next = head;
        while(head.next != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println(head.data + " -> null");
        System.out.println(dummy.next.data);
        ListNode prev = dummy;
        System.out.println(prev.data);
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        System.out.println(prev.data);

        ListNode current = prev.next;
        System.out.println(current.data);
        for (int i = 0; i < right - left; i++) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        int left = 2;
        int right = 4;
        ListNode ans = revers(l1, left, right);
        while(ans.next != null) {
            System.out.print(ans.data + " -> ");
            ans = ans.next;
        }
        System.out.println(ans.data + " -> null");
    }
}

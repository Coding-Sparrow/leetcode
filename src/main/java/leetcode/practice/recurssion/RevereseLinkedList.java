package leetcode.practice.recurssion;

import leetcode.practice.utils.ListNode;

public class RevereseLinkedList {
    public static void main(String[] args) {
        ListNode head =  new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next =  node1;
        head.next.next =  node2;
        head.next.next.next =  node3;
        head.next.next.next.next =  node4;
        ListNode reversed = reverse(head);
        while(reversed != null) {
            System.out.println(reversed.data);
            reversed = reversed.next;
        }
    }

    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}

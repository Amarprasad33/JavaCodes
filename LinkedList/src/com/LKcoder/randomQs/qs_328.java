package com.LKcoder.randomQs;

import java.util.LinkedList;


public class qs_328 {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(5);
        l1.add(7);
        System.out.println(l1.getLast());
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

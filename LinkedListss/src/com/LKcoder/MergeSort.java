package com.LKcoder;

class ListNode {
    int val;
    ListNode next;

    ListNode(){}

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MergeSort {


    public com.LLQuestions.ListNode sortList(com.LLQuestions.ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        com.LLQuestions.ListNode mid = getMid(head);
        com.LLQuestions.ListNode left = sortList(head);
        com.LLQuestions.ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }


    public com.LLQuestions.ListNode mergeTwoLists(com.LLQuestions.ListNode list1, com.LLQuestions.ListNode list2) {
        com.LLQuestions.ListNode dummyHead = new com.LLQuestions.ListNode();
        com.LLQuestions.ListNode tail = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2 ;
        return dummyHead.next;
    }

    com.LLQuestions.ListNode getMid(com.LLQuestions.ListNode head){
        com.LLQuestions.ListNode midPrev = null;
        while ( head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        com.LLQuestions.ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

}



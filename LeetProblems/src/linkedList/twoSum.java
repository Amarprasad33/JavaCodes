package linkedList;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class twoSum {


 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode temp = head;
    int carry = 0;
    while (l1 != null || l2 != null){
       int sum = ((l1 == null )? 0: l1.val) + ((l2 == null )? 0 : l2.val) + carry;
        ListNode cur = new ListNode(0);
           cur.val = sum % 10;
           carry = sum/10;
           temp.next = cur;
           temp = cur;



        l1 = (l1 == null) ? l1 : l1.next;
        l2 = (l2 == null) ? l2 : l2.next;
    }
    return head.next;
 }
}

package mayChallenge;
import java.util.*;
public class qs_1721 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        swapNodes(head, 2);
        ListNode c = head;

        while (c != null){
            System.out.print(c.val + "-->");
            c = c.next;
        }
    }

    public static ListNode swapNodes2(ListNode head, int k) {
        ListNode temp = head;
        int n =1, i = 1;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        n -= 1;
        ListNode firstPrev = head; ListNode curr = head;
        ListNode firstNext = head;
        ListNode secSwap = head;
        while(curr != null){
            // swapping the nodes
            if(n-k == i){
                secSwap = curr.next;
                temp.next = curr.next.next;
                curr.next = temp;
                secSwap.next = firstNext;
                firstPrev.next = secSwap;
                break;
            }
            if(i == k-1){
                temp = curr.next;
                firstPrev = curr;
                firstNext = curr.next.next;
            }
            curr = curr.next;
            i++;
        }
        return head;
    }

    // A better sol
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode fast  = head;
        ListNode slow = head;

        while (k-1>0){
            fast = fast.next;
            k--;
        }
        ListNode node1 = fast;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode node2 = slow;

        int tmp = node1.val;
        node1.val = node2.val;
        node2.val = tmp;

        return head;
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

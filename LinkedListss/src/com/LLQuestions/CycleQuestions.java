package com.LLQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.function.LongUnaryOperator;

public class CycleQuestions {

    Node head;
    Node tail;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    // https://leetcode.com/problems/linked-list-cycle/

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // Calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }


    // Detection of the start of the cycle
    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = LengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the first node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // Happy number
    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    // Middle of the linked list
    // https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    // google, apple, amazon, microsoft
    //https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }


        // linkedin, google, facebook, microsoft, amazon, apple
        //  https://leetcode.com/problems/palindrome-linked-list/
        public boolean isPalindrome(ListNode head){
           ListNode mid = middleNode(head);
            ListNode headSecond = reverseList(mid);
            ListNode reverseHead = headSecond;

            // compare both the sides
            while (head != null && headSecond != null){
                if (head.val != headSecond.val){
                    break;
                }
                head = head.next;
                headSecond = headSecond.next;
            }
            reverseList(reverseHead);

            return head == null || headSecond == null;
        }

    // Google, Microsoft
    // Qs : to reorder the list in a certain way
    // https://leetcode.com/problems/reorder-list/

    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // setting next of tail to null
        if (hf != null){
            hf.next = null;
        }
    }

    // Question asked in google, microsoft, facebook, amazon
    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    // Its also reversing the < k end items -> modify it accordingly
    // Modified , answer is coming on simple testcases but null pointer exception is occurring repeated times
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode lastPrev ;

       while (true){

           ListNode last = prev;
           ListNode newEnd = current;
           int c = 0;
           lastPrev = last;


           // reverse k times
           ListNode next = current.next;
           for (int i = 0; current != null && i < k; i++) {
                   current.next = prev;
                   prev = current;
                   current = next;
                   if (next != null){
                       next = next.next;
                   }
                   c++;
           }

           if ( last != null){
               last.next = prev;
           } else {
               head = prev;
           }
           newEnd.next = current;
           if (current == null){
               break;
           }
           prev = newEnd;
       }
       prev = reverseList(lastPrev.next);
       lastPrev.next = prev;
        return head;
    }


    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode lastPrev ;

        while (current != null){

            ListNode last = prev;
            ListNode newEnd = current;
            int c = 0;
            lastPrev = last;


            // reverse k times
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
                c++;
            }

            if ( last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            // skip the k nodes
            for (int i = 0;  current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }

        return head;
    }


    // Another solution of the above problem
    // copied from discuss page
    // https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/183356/Java-O(n)-solution-with-super-detailed-explanation-and-illustration
    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        while (pointer != null) {
            ListNode node = pointer;
            // first check whether there are k nodes to reverse
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) break;

            // now we know that we have k nodes, we will start from the first node
            ListNode prev = null, curr = pointer.next, next = null;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode tail = pointer.next;
            tail.next = curr;
            pointer.next = prev;
            pointer = tail;
        }
        return dummy.next;
    }

    // Facebook, twitter, google
    // https://leetcode.com/problems/rotate-list/submissions/
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null){
            return head;
        }
        
        ListNode last = head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length++;
        }
        
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }


    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }





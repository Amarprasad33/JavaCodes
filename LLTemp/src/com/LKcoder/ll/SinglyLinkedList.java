package com.LKcoder.ll;

public class SinglyLinkedList {

    Node head;
    class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
        }
    }

    public void InsBeg(int inp)
    {
        if (head == null)
        {
            head = new Node(inp);
            return;
        }

        Node new_Node = new Node(inp);
        new_Node.next = head;
        head = new_Node;
    }

    public void InsSpecific(int index, int new_data)
    {
        if (index == 0) {
            System.out.println( "The given previous node cannot be null");
            return;
        }
        Node temp = head;
        int i = 1;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        Node new_node = new Node(new_data);
        new_node.next = temp.next;
        temp.next = new_node;
    }

    public void InsEnd(int inp)
    {
        Node new_node = new Node(inp);

        if (head == null)
        {
            head = new Node(inp);
            return;
        }
        new_node.next = null;  // It's going to be the last node so making the next part null
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void delBeg(){
        if (head == null){
            System.out.println("List is empty ");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void delEnd()
    {
        if (head == null){
            System.out.println("List is empty ");
            return;
        }

        Node seclast = head;
        while (seclast.next.next != null) {
            seclast = seclast.next;
        }
        seclast.next = null;
        return;
    }

    void delKeyNode(int target)
    {
        Node temp = head, prev = null;

        // If head node contains target to be deleted
        if (temp != null && temp.data == target) {
            head = temp.next; // Changed head
            return;
        }
        while (temp != null && temp.data != target) {
            prev = temp;
            temp = temp.next;
        }
        // If target is not present in linked list
        if (temp == null)
            return;
         prev.next = temp.next;       // Unlink or delete the node from linked list
    }

    public void delIndex(int index)
    {
        if (head == null) {
            System.out.println("List is empty : ");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head, prev = head;
        int i = 1;
        while(i < index ){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        temp.next = null;
    }

    public void Display(){
        Node Traverse_node = head;
        while(Traverse_node != null){
            System.out.print(Traverse_node.data + "---->");
            Traverse_node = Traverse_node.next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.InsBeg(7);
        list.InsBeg(6);
        list.InsBeg(5);
        list.InsEnd(8);
        list.InsEnd(9);

        list.InsSpecific(3, 56);
     //   list.delBeg();
        list.delEnd();
       // list.delKeyNode(56);
       // list.delIndex(3);

        System.out.println("Created Linked List is : ");
        list.Display();
    }

}

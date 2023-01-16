package com.LKcoder;

public class SIngleLL {
    private int size;

    SIngleLL(){
        this.size= 0;
    }
    node head;
    class node{
        String data;
        node next;

        node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
     //add or input from first
    public void addFirst(String data){
        node newNode = new node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //adding in last
    public void addLast(String data){
        node newNode = new node(data);
        if (head == null){
            head = newNode;
            return;
        }
        node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //printing the list
    public void pList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        node currN = head;
        while(currN != null){
            System.out.print(currN.data + " -> ");
            currN = currN.next;
        }
        System.out.println("null");
    }

    //deleting at first
    public void delFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //deleing at last
    public void delLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        node secondLast = head;
        node last = head.next;       // if head.next = null
        while(last.next != null){   // then null.next  doesnt exist
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public void reverseIterate() {
        if(head ==null || head.next == null) {
            return;
        }
        node prevNode = head;
        node currNode = head.next;
        while(currNode != null) {
            node nextNode  = currNode.next;
            currNode.next  =prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head=  prevNode;
    }


    public static void main(String[] args) {
        SIngleLL list = new SIngleLL();
        list.addFirst("a");
        list.addFirst("is");
        list.pList();

        list.addLast("list");
        list.pList();

        list.addFirst("this");
        list.pList();
        list.addLast("boii");
        list.pList();

        list.delFirst();
        list.pList();

        list.delLast();
        list.pList();

        System.out.println(list.getSize());
        list.addFirst("ok");
        System.out.println(list.getSize());

        list.reverseIterate();
        list.pList();

    }
}

package com.LKcoder.ll;

public class DoublyLinkedList {
	
	
	Node head; 	 

    class Node {
        int data;
        Node prev;
        Node next;
 
        Node(int d) { 
        	data = d; 
        }
    }
    
    public void insBeg(int inp)
    {
        
        Node new_Node = new Node(inp);
     
        new_Node.next = head;
        new_Node.prev = null;
     
        if (head != null)
            head.prev = new_Node;
     
        head = new_Node;
    }
    
    public void insSpecific(int index, int inp) {
    	if (index <= 0) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
    	
    	Node new_node = new Node(inp);
    	 Node temp = head;
    	 int i = 1;
    	 while(i < index ) {
    		 temp = temp.next;
    		 i++;
    	 }
        new_node.next = temp.next;
     
        temp.next = new_node;
    
        new_node.prev = temp;

        if (new_node.next != null)
            new_node.next.prev = new_node;
    }
    
    public void insEnd(int inp) {
    	Node new_Node = new Node(inp);
    	 
        Node last = head;
        
        new_Node.next = null;
        if (head == null) {
            new_Node.prev = null;
            head = new_Node;
            return;
        }
        while (last.next != null)
            last = last.next;
     
        last.next = new_Node;
     
        new_Node.prev = last;
    }
    
    public void delBeg() {
    	if(head == null) {
    		System.out.println("List is empty");
    		return;
    	}
    
    	head.next.prev = null;
    	head = head.next;
    }
    
    public void delNode(Node del) {
    	if (head == null || del == null) {
            return;
        }
 
        if (head == del) {
            head = del.next;
        }
 
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        
        return;
    }
    
    public void delIndex(int index) {
    	if (head == null || index <= 0) {
            return;
        }
    	Node temp = head;
   	 int i = 1;
   	   while(i < index ) {
   		 temp = temp.next;
   		 i++;
       	}
   	   
   	if (index == 1) {
        head = head.next;
    }
   	
   	if (temp.next != null) {
        temp.next.prev = temp.prev;
    }

    if (temp.prev != null) {
        temp.prev.next = temp.next;
    }
    
    return;	
   }
    
    public void delEnd() {
    	if (head == null) {
    		System.out.println("List is empty");
            return;
        }
    	Node last = head;
    	while(last.next != null) {
    		last = last.next;
    	}
    	last.prev.next = null;
    	last.prev = null;
    }
    
    
    public void display()
    {
    	Node Trav = head;
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (Trav != null) {
            System.out.print(Trav.data + " ");
            last = Trav;
            Trav = Trav.next;
        }
        System.out.println();
        
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    
    public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insBeg(8);
		list.insBeg(5);
		list.insBeg(3);
		list.insBeg(1);
		//
		list.insSpecific(2, 26);
		
		//list.delBeg();
	//	list.delIndex(4);
	//	list.delEnd();
		
		list.display();
		
		
	}

}

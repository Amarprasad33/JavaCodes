package com.LKcoder.ll;



public class SinglyCircular {
 	 

    class Node {
        int data;
        Node tail;
        Node next;
 
        Node(int d) { 
        	data = d; 
        }
    }
    public Node head = null;  
    public Node tail = null; 
    
    public void insertFirst(int data) {
    	  Node newNode = new Node(data);
    	  if (head == null) {
    	    head = newNode;
    	    tail = newNode;
    	    newNode.next = head;
    	  } else {
    	    Node temp = head;
    	    newNode.next = temp;
    	    head = newNode;

    	    tail.next = head;
    	  }
    	}
    
    public void insEnd(int inp) {
    	Node newNode = new Node(inp);  
        if(head == null) {    
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            
            tail.next = newNode;           
            tail = newNode;    
            tail.next = head;  
        }  
    }

    public void deleteNode(int valueToDelete) {
        Node currentNode = head;
        if (head == null) { // the list is empty
            return;
        }
        do {
            Node nextNode = currentNode.next;
            if (nextNode.data == valueToDelete) {
                if (tail == head) { // the list has only one single element
                    head = null;
                    tail = null;
                } else {
                    currentNode.next = nextNode.next;
                    if (head == nextNode) { //we're deleting the head
                        head = head.next;
                    }
                    if (tail == nextNode) { //we're deleting the tail
                        tail = currentNode;
                    }
                }
                break;
            }
            currentNode = nextNode;
        } while (currentNode != head);
    }
    
    
    
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
        	
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head); 
             
            System.out.println();  
        }  
    } 
    
    public static void main(String[] args) {
		SinglyCircular list = new SinglyCircular();
		
		list.insertFirst(6);
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(1);
		
		list.insEnd(9);

        //list.deleteNode(4);
		
		
		
		
		
		
		
		list.display();
	}
	

}

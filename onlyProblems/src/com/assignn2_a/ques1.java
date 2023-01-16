package com.assignn2_a;
import java.util.*;
public class ques1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);


        //Display The ArrayList
        System.out.println(al);

        //Searching in the Arraylist
        System.out.println("Enter the Element to search::");
        int x =sc.nextInt();
        boolean res =al.contains(x);
        if(res)
            System.out.println("Entered Element is Present in ArrayList");

        else
            System.out.println("Element Not Present in ArrayList");

        //Removing The Element from Specific Position
        System.out.println("Enter the Position Of Element to delete::");
        int  y =sc.nextInt();

        //Checking wheather the arralist is Empty or not
        if(al.isEmpty()) {
            System.out.println("Your Arralist Is Empty");
        }
        else {
            al.remove(y);
            System.out.println("The Element Removed SuccessFully");
        }
        System.out.println(al);


    }

}

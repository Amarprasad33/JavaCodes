package com.Properties.Inheritance;

import java.lang.management.BufferPoolMXBean;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4, 8, 6);
        box1.getL();
      // Box box2 = new Box(box1);
     //   System.out.println(box1.l + " " + box1.h + " " + box1.w );

//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w); // here the reference type determines which members can be accessed


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // this is why error

//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);


        BoxPrice box = new BoxPrice();
         Box.greeting();

         Box box7 = new BoxWeight();
         box7.greeting(); // You can inherit but you cannot override

    }
}

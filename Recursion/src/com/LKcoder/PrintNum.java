package com.LKcoder;

public class PrintNum {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }
       // Recursion
     static void print(int n) {
        if (n==5){     // Base Conditon
            System.out.println(n);
            return;
        }
        System.out.println(n);
         // Recursive Call
         // if you are calling a function again and again, you can treat it as a separate call in the stack

         // this is called tail recursion
         //this is the last function call
         print(n + 1);
    }


    // Simpler Way
//    static void print1(int n){
//        System.out.println(n);
//        print2(2);
//    }static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n){
//        System.out.println(n);
//        print1(5);
//    }
//    static void print5(int n){
//        System.out.println(n);
//    }

}

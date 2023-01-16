package com.interfaces.extendDemo2.extendDemo;

public interface A {
    // Static interface methods should always have a body
    // call via the interface name
    static void greeting(){
        System.out.println("Hey I am static method");
    }



    default void fun(){
        System.out.println("I am in A");
    }
}

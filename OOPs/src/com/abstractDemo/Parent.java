package com.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age){
        this.age = age;
        VALUE = 4815688;
    }

    static void hello(){
        System.out.println("Hey ");
    }

    void normal(){
        System.out.println("This is a normal method ");
    }

    abstract void career();
    abstract void partner();
}

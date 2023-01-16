package com.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to ba a doctor ");
    }

    @Override
    void partner() {
        System.out.println("I love Peppper pots " );
    }
}

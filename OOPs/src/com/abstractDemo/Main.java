package com.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(19);
        son.career();

        Daughter daughter = new Daughter(24);
        daughter.career();

        Parent.hello();
   //     Parent mom = new Parent() ;  // we cannot create objects of an abstract class


    }
}

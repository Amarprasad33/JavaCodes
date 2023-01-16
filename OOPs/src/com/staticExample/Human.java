package com.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // long population ;  // For same population of all human objects it should be static
    static long population;

    static void message(){
        System.out.println("Hello World");
    //    System.out.println(this.age);  // cant use this over here
                                            // because it is non static and present in a static context
    }


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}

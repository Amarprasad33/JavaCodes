package com.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal =new Human(22, "Kunal", 10000, false);
        Human Rahul =new Human(22, "Rahul", 15000, true);;

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main ob = new Main();
        ob.fun2();

    }

    // this is not dependent on objects
    static void fun(){
       // greeting();  // you cant use this because it requires an instance
                        // but the function you are using it in does not depend on instance

        // You cannot access non static stuff without referencing their instances in
        // a static context

        // Hence, here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){  // Since it is a non static function and when this has to run inside a static function
        // a Object must be created to call it coz not static in a static context
        greeting();
    }

    // We know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello World");
    }

}

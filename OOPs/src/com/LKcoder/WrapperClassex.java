package com.LKcoder;

public class WrapperClassex {
    public static void main(String[] args) {
//        int a=10;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

       // swap(a, b);   // Still it will not swap because the wrapper class is finite

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("Kunal kushwaha");
        kunal.name = "Other name";

        // when a non primitive is final, you cannot reassign it
     //   kunal = new A("new Object");

        A obj = new A("Rfjnihiaodf");

        System.out.println(obj);

//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random Name");
//        }

    }

     void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class  A {
    final int nu = 10;
    String name ;

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

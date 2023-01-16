package com.singleton;

import com.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       // SubClass obj = new SubClass(22, "Kunal Kushwaha");
        A obj = new A(22, "Kunal Kushwaha");
       // int n= obj.num;  // It is not allowed here coz if by the parent class(A) we can accessthe
                            // protected members then there is no use of protected in java
    }
}

class SubSubclass extends SubClass{

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(22, "Kunal Kushwaha");
        int n = obj.num;
    }
}


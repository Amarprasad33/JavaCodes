package com.ArrayProblems;

public class tr {
    public static void main(String[] args) {
        String as = "Amar";
        as += 1;
        //System.out.println(as);
        System.out.println(jod(as));

    }

    static String jod(String a){

     String ret =   change(a);
        return ret+"15";
    }

    private static String  change(String a) {
        a += "prasad";

        return a;
    }
}

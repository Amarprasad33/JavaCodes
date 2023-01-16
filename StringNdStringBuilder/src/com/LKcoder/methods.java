package com.LKcoder;


import java.util.Arrays;
import java.util.Locale;

public class methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());  // created a new object not changes in the same Object
        System.out.println(name);
        System.out.println(  name.indexOf('a'));
        System.out.println("    Kunal    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

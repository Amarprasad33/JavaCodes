package com.LKcoder.Concepts;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b' );
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
    //     System.out.println("Kunal" + new Integer(56));
        //String ans = new Integer(56) + "" + new ArrayList<>();
    //    System.out.println(ans);


    }
}

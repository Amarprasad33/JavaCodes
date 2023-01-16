package com.PeroBleems;

public class PrintNto1 {
    public static void main(String[] args) {
        prRevBoth(5);
    }

    // prefix and postfix increment in recursion
    static void concept(int n){
        if( n == 0){
            return;
        }

        System.out.println(n);
      //  concept(n--);    // This will give stack overflow error
        concept(--n);
//       n-- VS --n
    }

    static void pr(int n){
        if( n == 0){
            return;
        }

        System.out.println(n);
        pr(n -1);
    }

    static void prRev(int n){
        if( n == 0){
            return;
        }
        prRev(n -1);
        System.out.println(n);
    }

    static void prRevBoth(int n){
        if( n == 0){
            return;
        }

        System.out.println(n);

        prRevBoth(n -1);

        System.out.println(n);
    }



}

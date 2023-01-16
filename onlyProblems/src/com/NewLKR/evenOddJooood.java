package com.NewLKR;

public class evenOddJooood {
    public static void main(String[] args) {

        int  n = 67;
        System.out.println(IsOdd(n));
    }

    static boolean IsOdd(int n){
        return ( n & 1) == 1;
    }
}


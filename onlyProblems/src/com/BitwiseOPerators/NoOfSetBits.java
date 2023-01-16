package com.BitwiseOPerators;

public class NoOfSetBits {
    public static void main(String[] args) {

        int n = 197;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));

    }

    private static int setBits(int n) {
        int count = 0;

//        while (n > 0){
//            count++;
//            n -= (n & -n);        // First Way
//        }


        while (n > 0){
            count ++;
            n = (n & n-1);    // Second Way
        }


        return count;
    }
}

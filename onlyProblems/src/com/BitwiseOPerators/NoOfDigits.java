package com.BitwiseOPerators;

public class NoOfDigits {
    public static void main(String[] args) {  // gives the number of digits in any base
        // where n is the number and b is the base
        int n = 11;
        int b = 2;

        int ans = (int)(Math.log(n)/Math.log(b)) + 1;

        System.out.println(ans);
    }


}

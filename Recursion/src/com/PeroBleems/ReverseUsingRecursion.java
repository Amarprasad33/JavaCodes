package com.PeroBleems;

import java.nio.charset.StandardCharsets;

public class ReverseUsingRecursion {

    static  int sum = 0;
    static void rev1(int n){
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum  = sum *10 + rem;
        rev1(n/10);
    }

    static int rev2(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n) + 1);
        return helper(n , digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10 , digits -1)) + helper(n / 10 , digits -1);
    }

    // palindrome using recursion
      static boolean check;
    static boolean palin2Complex(int[] n ,int s, int e ){
        if (s > e){
            return check;
        }
        if( n[s] == n[e]){
            check = true;
        }else {
            check = false;
        }
        return palin2Complex(n , ++s, --e);
    }


    static boolean palin( int n){
        return n == rev2(n);
    }


    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(palin2Complex(num , 0 , num.length-1));   // checking palindrome
        System.out.println(rev2(1234));
       // System.out.println(sum);
    }

}


package com.LKcoder;

public class fibo {
    public static void main(String[] args) {
        int ans = Fibo(60);
        System.out.println(ans);
    }

    static int Fibo(int n){
        // base condition
        if (n < 2){
            return n;
        }
        return Fibo(n-1) + Fibo( n-2);   // Recursive Call
    }
}

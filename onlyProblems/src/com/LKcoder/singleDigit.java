package com.LKcoder;

public class singleDigit {
    public static void main(String[] args) {
        single(999);

    }

    static void single(int n){
        int ans=0;
        while(n > 10){
            n = n%10 + n/10;
        }
        System.out.print(n);
    }

}

package com.problems;

public class lgnum {
    public static void main(String[] args) {
       int a = 22 ;
       int b= 3378;
        System.out.println(largestNum(a,b));

    }

    static int largestNum(int a, int b){
        return a * ((a/b) >0? 1:0) + b* ((b/a) >0? 1:0);
    }


}

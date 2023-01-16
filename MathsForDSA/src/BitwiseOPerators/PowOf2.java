package com.BitwiseOPerators;

public class PowOf2 {
    public static void main(String[] args) {
        int n = 33;
        System.out.println(Optimized(n));   // Note : Fixed for n = 0 , so it is an exceptional case

    }

    static boolean BruteForceApproach(int n){
        int count=0;
         while(n > 0){
             if ( (n & 1) ==1 )
                 count++;
             n = n >> 1;

         }

         return count == 1;
    }

    static boolean Optimized(int n){

        return (n & (n-1))==0 ;
    }
}

package com.LKcoder;

public class sumOfPrime {
    public static void main(String[] args) {
        int n = 3;
        while( n < 1000){
           int temp = rem(n);
          int ans = pr(temp);       //finds the numbers less than 1000 whose sum of the individual digits is a prime number
          if(ans == 0){
              System.out.println(n +" ");
          }
          n++;
        }
    }
    static int rem (int n ){
          int rem   = 0;
          if(n < 10){
              return n;
          }else if(n < 100) {
              rem = n % 10 + n / 10;
          }else{
              rem = n%10;
              n= n/10;
              rem = rem +(n % 10 + n / 10);
          }
        return rem;
    }
     static int pr(int n){
        int flag = 0;
        if(n ==0 || n==1){
            flag=1;
        }
         for (int i = 2; i < n ; i++) {
             if ( n%i == 0){
                 flag = 1;
             }
         }
         return flag;
     }
}

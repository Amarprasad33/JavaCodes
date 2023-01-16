package com.curocode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evendigits {
    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static  int findNumbers(int[] nums) {
        int count = 0;
        for(int element : nums){
            if(even(element)) {
                count++;
            }
        }
         return  count;
    }
      // function to check whether it contains even digtits or not
     static boolean even(int num) {
        int numbeOfDigits = digits(num);
        /*
         if( numbeOfDigits % 2 == 0){
            return true;
          }
           return false;
        */
         return numbeOfDigits % 2 == 0;  // simplified
     }

    static int digits(int num){
        if ( num < 0){
            num = num * -1;
     }
        if (num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;

    }

}

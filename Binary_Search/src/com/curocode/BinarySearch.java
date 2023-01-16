package com.curocode;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {-18, -12, -4 ,58 ,6, 3 ,98 ,77, 66};
        int target = -4;
       int ans =  Binary(arr, target );
        System.out.println(ans);

    }

    //return the index
    //return -1 if index does not exist
    static int Binary(int[] arr, int target){
          int start = 0;
          int end = arr.length -1;

          while(start <= end){
              // Finding the mid element
         //     int mid = (start + end );  //might be possible that (start + end )exceeds the range of int in java
            int mid = start + (end - start)/2;


            if (target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
          }
        return -1;
       }
}

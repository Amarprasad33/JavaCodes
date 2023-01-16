package com.curocode;

public class ceiling {

    public static void main(String[] args) {
        int[] arr= {2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
       int ans =  Ceiling(arr, target );
        System.out.println(ans);

    }

    //return the smallest number >= target
    static int Ceiling(int[] arr, int target){

        //but if the target element is greater than the largest element in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

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
        return start;
       }
}

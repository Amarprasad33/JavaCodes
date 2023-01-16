package com.curocode;

public class tr {
    public static void main(String[] args) {
        int[] ar= {-18, -12, -4 ,6, 68 , 77, 98, 99};
        int target = 98;
        int ans =  Binary(ar, target );
        System.out.println("ans = "+ ans );
    }

    static int Binary(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            // Finding the mid-element
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

//public class SmallestLetter {
//

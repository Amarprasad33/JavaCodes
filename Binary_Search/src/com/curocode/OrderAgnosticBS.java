package com.curocode;

public class OrderAgnosticBS {
    public static void main(String[] args) {
      //  int[] ar= {-18, -12, -4 ,6, 68 , 77, 98, 99};
        int[] ar ={99, 91, 87, 65, 51, 44, 37, 24, 17, 9, 5, 1, -65, -122};
        int target = 65;
        int ans =  orderAGBS(ar, target );
        System.out.println("ans = "+ ans );
    }

    static int orderAGBS(int[] arr, int target){
     int start = 0;
     int end = arr.length -1;

     //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // Finding the mid element
            //     int mid = (start + end );  //might be possible that (start + end )exceeds the range of int in java
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
                 if (isAsc){
                     if (target < arr[mid]){
                         end = mid -1;
                     }
                     else if (target > arr[mid]){
                         start = mid +1;
                     }
                 }
                 else{
                     if (target > arr[mid]){
                         end = mid -1;
                     }
                     else if (target < arr[mid]){
                         start = mid +1;
                     }

                 }

        }
        return -1;

    }
}

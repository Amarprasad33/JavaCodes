package com.Set1;
//2nd largest element in an array

public class ndLargest {
    public static void main(String[] args) {
        int[] arr = {2,4,7,1,3,29,14};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr){
          int max =0;
          int max2 =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max2 && arr[i] < max){
                max2 = arr[i];
            }
        }
        return max2;
    }

     /*  static int anotherWay(int[] arr){
           int max1 =0;
           int max2 =0;
           for(int i = 1; i < arr.length ; i++) {
               if (arr[i] > max1) {
                   if(max2 < max1) {
                       max2 = max1;
                   } else {
                       max2 = arr[i];
                   }
                   max1 = arr[i];

               }
           }
           return max2;
       } */
}

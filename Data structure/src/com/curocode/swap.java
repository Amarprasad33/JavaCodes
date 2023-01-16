package com.curocode;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,54,68,69,22};
     //  Swap( arr, 0 , 2);
         reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            Swap( arr , start , end);
            start++;
            end--;


        }
    }


    static void Swap(int[] arr,  int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}

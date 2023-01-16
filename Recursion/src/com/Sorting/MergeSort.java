package com.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
         int[] arr = {5, 4, 3, 2, 1};
         int[] ans = mergeSort(arr);    // new object is created mix , it is not changing the original array
        System.out.println(Arrays.toString(ans));
        // displaying the old object the "arr"
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left , right);
    }

     static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

         while (i < first.length && j < second.length){
             if (first[i] < second[j]) {
                 mix[k] = first[i];
                 i++;
             }else {
                 mix[k] = second[j];
                 j++;
             }
             k++;
         }
         // It may be possible that one of the arrays is not complete
         // copy the rest of the elements
         while (i < first.length){
             mix[k] = first[i];
             i++;
             k++;
         }
         while(j < second.length){
             mix[k] = second[j];
             j++;
             k++;
         }

         return mix;
    }

}

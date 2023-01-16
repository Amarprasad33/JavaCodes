package com.Practice;

import java.util.Arrays;

public class Pr1st {
    public static void main(String[] args) {
           int[] arr = {2, 1, 0, 3, 9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = gmax(arr, 0,  last);
            swap(arr, max , last);
        }
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j , j-1);
                }else{
                    break;
                }
            }
        }
    }


    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    static int gmax(int[] arr, int first, int last){
        int max = first;
        for (int ele = first; ele <= last; ele++) {
            if (arr[max] < arr[ele]){
                max = ele;
            }
        }
        return max;
    }

}

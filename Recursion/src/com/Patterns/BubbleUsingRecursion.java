package com.Patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleUsingRecursion {

    public static void main(String[] args) {
           int[] arr = {1, 4, 3, 5, 2};
//           bubble(arr, arr.length -1, 0);
//        System.out.println(Arrays.toString(arr));

        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static  void bubble(int[] arr, int r, int c){
        if ( r == 0){
            return;
        }
        if (c < r){
            if ( arr[c] > arr[c+1]){
                // Swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;

            }
            bubble(arr, r , c+1);
        }
        else {
            bubble(arr, r-1, 0);
        }
    }


    static void selection(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }

        if (c < r){
            if (arr[c] > arr[max]){
                selection(arr, r, c+1, c);   // Why c is maximum here? : coz we have to swap it with the last index in that pass
            }else {
                selection(arr, r, c+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r-1, 0, 0 );
        }

    }

}

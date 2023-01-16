package com.curocode;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 56, 87, 98},
                {55, 88, 99},
                {7, 43, 88 },
                {18, 12}
        };

        int target = 98;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

   static int[] search(int[][] arr, int target) {
       for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               if(arr[row][col] ==target ){
                   return new int[] {row,col};

               }
           }
       }
       return new int[] {-1,-1};
    }

    static int max(int[][] arr) {
        int max = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;

                }
            }
        }
        return max;
    }
}

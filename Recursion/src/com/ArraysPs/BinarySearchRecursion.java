package com.ArraysPs;

public class BinarySearchRecursion {
    public static void main(String[] args) {
          int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(BSR(arr, 7, 0, arr.length-1));
    }

    static int BSR(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }

        int m = s + (e-s)/2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[e]){
            if (target >= arr[s] && target <= arr[e]){
                return BSR(arr, target, s, m-1);
            }else {
                return BSR(arr, target, m + 1, e);
            }
        }

        if ( target >= arr[m] && target <= arr[e]){
            return BSR(arr, target, m + 1, e);
        }else
            return BSR(arr, target, s, m-1);
    }

}

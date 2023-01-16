package com.ZProblems;

import java.util.Arrays;

public class tr {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr1 = {7, 1, -3, 0, 9, 4 };

        int[] ans = merg(arr);    // new object is created mix , it is not changing the original array
        System.out.println(Arrays.toString(ans));
        // displaying the old object the "arr"
        System.out.println(Arrays.toString(arr));

        Quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }

    static int[] merg(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merg(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merg(Arrays.copyOfRange(arr, mid, arr.length));

        return mixx(left, right);
    }

    private static int[] mixx(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else if (right[j] < left[i]) {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }


    static void Quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while (s <= e){

            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Quick(arr, low, e);
        Quick(arr, s , high);

    }
}

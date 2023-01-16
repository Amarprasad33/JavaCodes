package com.ZProblems;

public class MissngNum {
    public static void main(String[] args) {
            int[] arr = {3, 0, 1,2};
        System.out.println(Miss(arr));
        System.out.println(('2' - '0'));
    }

    static int Miss(int[] arr) {               // Range here is 0 - N
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i && arr[i] != arr.length) {
                swap(arr, arr[i], i);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s]  = temp;
    }
}

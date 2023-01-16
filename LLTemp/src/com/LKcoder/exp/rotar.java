package com.LKcoder.exp;

import java.util.Arrays;

public class rotar {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        System.out.println(Arrays.toString(rot(arr, 3)));

    }

    static int[] rot(int[] ar, int k){
        for (int i = 0; i < ar.length -k ; i++) {
            swap(ar);
        }
        return ar;
    }

    private static void swap(int[] ar) {
        int temp =ar[0]  ;
        int i;
        for ( i = 0; i < ar.length -1; i ++){
            ar[i] = ar[i + 1];
        }
        ar[i]= temp;
    }
}

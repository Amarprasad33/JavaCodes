package com.Set1;

import java.util.Arrays;

public class RemoveDuplicate {     // #LKquestion
    public static void main(String[] args) {
        int[] ar = {4,5,6,7,7,7,9,11,11,11,14};
        remove(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }

    }

    static void remove(int[] arr){
        int n =arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1] ){
                arr[i]  =0;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            int k = ++i;
            if (arr[i] == 0 && arr[k] != 0 ) {
                arr[i] = arr[i + 1];
            }
        }


    }
}

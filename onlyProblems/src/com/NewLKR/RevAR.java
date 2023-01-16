package com.NewLKR;

public class RevAR {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7};
        Ar(arr);

    }

    static void Ar(int[] arr){
          int n = arr.length;
          int end = n-1;
        for (int i = 0; i < n/2; i++) {

            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

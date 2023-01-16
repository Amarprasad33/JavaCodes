package com.curocode;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int[] arr= new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        System.out.println(Arrays.toString(arr));
//        for (int j : arr) {  // for the every element in the array, print the element
//            System.out.print(j + " ");  // here "j" represents element of the array
//        }

   //     System.out.println(arr[5]);  index out of bound exception

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();

        }

        System.out.println(Arrays.toString(str));

        // modify

        System.out.println(Arrays.toString(str));




    }
}

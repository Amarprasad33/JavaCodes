package com.curocode;

import java.util.Arrays;
import java.util.Scanner;

public class Multiar {
    public static void main(String[] args) {
           /*
             1 2 3
             4 5 6
             7 8 9
            */
        Scanner sc = new Scanner(System.in);



//        int [][] arr = {
//                {1, 2, 3, 4},// 0th index
//                {26, 58},  // 1st index
//                {77, 55, 11} // 2nd index -> arr2d[2] ={77, 55, 11}
//        } ;

        //input
        int [][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row 
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col]= sc.nextInt();
            }
       }

//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }


    }
}

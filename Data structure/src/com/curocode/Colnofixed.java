package com.curocode;

import java.util.ArrayList;
import java.util.Scanner;

public class Colnofixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int [][] arr = {
                {1, 2, 3, 4},
                {26, 58},
                {77, 55, 11}
        } ;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ") ;

            }
            System.out.println();
            
        }
    }

}

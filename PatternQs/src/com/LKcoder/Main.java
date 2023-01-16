package com.LKcoder;

public class Main {

    public static void main(String[] args) {
        pattern30(5);

    }

    static void pattern30(int n){
        for (int row = 1; row <= n ; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static  void pattern28(int n){
        for (int row = 0; row < 2* n ; row++) {
            //for every row, run the col
            int totalcolsinrow = row > n ? 2*n -row:row;

            int noOfSpaces = n - totalcolsinrow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static  void pattern5(int n){
        for (int row = 0; row < 2* n ; row++) {
            //for every row, run the col
            int totalcolsinrow = row > n ? 2*n -row:row;
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static  void pattern2(int n){
        for (int row = 1; row <= n ; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    static  void pattern3(int n){
        for (int row = 0; row < n ; row++) {
            //for every row, run the col
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}

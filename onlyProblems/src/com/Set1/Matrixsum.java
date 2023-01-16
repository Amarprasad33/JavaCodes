package com.Set1;

public class Matrixsum {
    public static void main(String[] args) {
        int[][] arr = {
                {4 ,5, 8, 6},
                {1, 7, 6, 2},
                {1, 3, 4, 9},
                {1, 5, 6, 7}
        };

        sum(arr);
    }

    static void sum(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            int sumR= 0;
            int sumC= 0;
            for (int j = 0; j < arr.length; j++) {
                sumR = sumR + arr[i][j];
                sumC = sumC + arr[j][i];
            }
            System.out.println("sum of row no."+ (i+1)+ "th " + sumR);
            System.out.println("sum of col no."+ (i+1)+ "th " + sumC);
        }

    }
}

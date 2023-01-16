package com.AdAssignment;

public class MatrixChainMultiplication {


    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 5};
        int[] arr1 = {5, 4, 6, 2, 7};
        int n = arr1.length;
        System.out.println("Minimum number of multiplication is " + MatrixChainOrder(arr1, 1, n-1));

    }

    static int MatrixChainOrder(int p[], int i, int j) {
        if(i == j) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j ; k++) {
            int count = MatrixChainOrder(p, i, k) + MatrixChainOrder(p, k+1, j) + p[i-1]*p[k]*p[j];
            if(count < min) {
                min = count;
            }
        }
        return min;
    }
}

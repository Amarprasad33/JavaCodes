package AvProblems;

import java.util.Arrays;

public class KnapSackRecursive {
    public static void main(String[] args) {
//        int[] wt = { 3, 2, 5, 4 };
//        int[] val = { 10, 8, 12, 9 };
        int[] wt = { 1, 2, 5, 6, 7 };
        int[] val = { 1, 6, 18, 22, 28 };
        int w = 11; // Ans should be 40
        int n = wt.length;
        System.out.println(knapSack(wt, val, w, n));

//        int[][] mat = new int[5][5];
//
//        for (int[] ar: mat){
//            Arrays.fill(ar, -1);
//            System.out.println(Arrays.toString(ar));
//        }
        for (int[] si: dp ){
            Arrays.fill(si, -1);
        }
        System.out.println(knapSackMemoization(wt, val, w, n));
//        for (int[] si: dp ){
//            System.out.println(Arrays.toString(si));
//        }
    }

    public static int knapSack(int[] wt, int[] val, int w, int n){
        if(n == 0 || w == 0)
            return 0;

//        if (wt[n-1] <= w)
//            return Math.max( val[n-1] + knapSack(wt, val, w-wt[n-1], n-1),
//                    knapSack(wt, val, w, n-1));
//        else if (wt[n-1] > w)
//            return  knapSack(wt, val, w, n-1);

        return (wt[n-1] > w) ? knapSack(wt, val, w, n-1) : Math.max( val[n-1] + knapSack(wt, val, w-wt[n-1], n-1),
                knapSack(wt, val, w, n-1));
    }

    // KnapSack Memoization
    // If the constraints are let's say: w <= 1000 & n <= 100
    // we will declare a 2d matrix globally and initialise it in the main function
    static int[][] dp = new int[102][1003];

    public static int knapSackMemoization(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0)
            return 0;

        if (dp[n][w] != -1){
            System.out.println("Dp used");
            return dp[n][w];
        }

        if (wt[n-1] <= w)
            dp[n][w] = Math.max( val[n-1] + knapSack(wt, val, w-wt[n-1], n-1),
                    knapSack(wt, val, w, n-1));
        else if (wt[n-1] > w)
            dp[n][w] =  knapSack(wt, val, w, n-1);

        return dp[n][w];
    }
}

package AvProblems;

public class KnapSackTopDownDP {
    public static void main(String[] args) {
        int[] wt = { 1, 2, 5, 6, 7 };
        int[] val = { 1, 6, 18, 22, 28 };
        int w = 11; // Ans should be 40
        int n = wt.length;
        System.out.println(knapSackTopDownDP(wt, val, w, n));
    }
    // pseudocode derived from the recursive knapsack
//        if(wt[n-1] <= w)
//            t[n][w] = MAX( val[n - 1] + t[n - 1][w - wt[n-1]] ,
//                            t[n -1 ][w] );
//        else
//            t[n][w] = t[n - 1][w];
//
//    This is the main logic --> just replace n --> i && w --> j
//




    public static int knapSackTopDownDP(int[] wt, int[] val, int w, int n){

        int[][] t = new int[n+1][w+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                if(i == 0 || j == 0 ){
                    t[i][j] = 0;
                }
            }
        }

        // Filling the remaining matrix
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
                } else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][w];

    }

}

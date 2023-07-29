package com.AVProblems;

public class NbitBinaryMore1thn0 {
    public static void main(String[] args) {
        int n = 3;
        generateNbitBinary(n);
    }

    // This code below should produce the output in the following way
    // For N = 5, the prefixes with No. of 1's >= No. of 0's
    // 11010 ==> 11010
    //           1101
    //           110
    //           11
    //           1
    // In all of the prefixes the 1's >= 0's
    // In Output: We have to give all(Not just One) the N digit numbers
    // satisfying the property
     private static void generateNbitBinary(int N){
        String op = "";
        int ones = 0, zeros = 0;
        helper(ones, zeros, op, N);
     }

    private static void helper(int ones, int zeros, String op, int n) {
        if(n == 0){
            System.out.println(op);
            return;
        }

        String op1 = op;
        op1 += '1';
        helper(ones+1, zeros, op1, n-1);
        if(ones > zeros){
             String op2 = op;
             op2 += '0';
             helper(ones, zeros+1, op2, n-1);
        }
    }


}

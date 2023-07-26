package com.AVProblems;

import java.util.Collections;

public class permutationWithSpaces {
    public static void main(String[] args) {
//        String ip = "ABC";
//        String op = "";
//        op += ip.charAt(0);
//        ip = ip.substring(1);
//        System.out.println(ip + "-------------" + op);
//        solvePermutationAV(op, ip);

        String ip = "ab";
        String op = "";
        PermutationCase(op, ip);


    }

    private static void solvePermutation(String op, String ip) {
            if (ip.isEmpty()){
                System.out.println(op);
                return;
            }
        solvePermutation(op + "-" + ip.charAt(0), ip.substring(1));
        solvePermutation(op + ip.charAt(0), ip.substring(1));
    }

    // The AV Way
    private static void solvePermutationAV(String op, String ip) {
        if (ip.isEmpty()){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        solvePermutationAV(op1 + "-" + ip.charAt(0), ip.substring(1));
        solvePermutationAV(op2 + ip.charAt(0), ip.substring(1));
    }

    // Below codes are for permutation with case change:
    // [a,b] ==> ab, Ab, aB, AB
    public static void PermutationCase(String op, String ip) {
        if (ip.isEmpty()){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        char ch = ip.charAt(0);
        op1 += Character.toUpperCase(ch);
        op2 += ip.charAt(0);
        PermutationCase(op1, ip.substring(1));
        PermutationCase(op2, ip.substring(1));
    }
}

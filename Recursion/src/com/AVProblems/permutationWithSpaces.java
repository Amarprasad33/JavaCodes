package com.AVProblems;

public class permutationWithSpaces {
    public static void main(String[] args) {
        String ip = "ABC";
        String op = "";
        op += ip.charAt(0);
        ip = ip.substring(1);
        System.out.println(ip + "-------------" + op);
        solvePermutationAV(op, ip);
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
}

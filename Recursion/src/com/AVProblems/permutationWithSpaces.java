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

//        String ip = "ab";
        String ip = "a1B2";
        String op = "";
        PermutationCaseLetterNum(op, ip);


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
    // This specific question assumes that the input is in small letters
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

    // Below code for the letter case permutaion
    // This can be in lower ro upper case
    // ["a1B2"] ==> A1b2, A1B2, a1b2, a1B2
    public static void PermutationCaseLetterNum(String op, String ip) {
        if (ip.isEmpty()){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        char ch = ip.charAt(0);
        if(!Character.isDigit(ch)){
            op1 += (Character.isLowerCase(ch))?  Character.toUpperCase(ch) : Character.toLowerCase(ch) ;
            op2 += ip.charAt(0);
            PermutationCaseLetterNum(op1, ip.substring(1));
            PermutationCaseLetterNum(op2, ip.substring(1));
        }else{
            PermutationCaseLetterNum(op + ch, ip.substring(1));
//            PermutationCaseLetterNum(op, ip.substring(1));
        }
    }

}

package com.LKcoder.Patterns;

public class trPattern {
    public static void main(String[] args) {
       // trianglePattern();
      //  trianglePatternOneZero();
       Extrapattern();
    }
    
    static void trianglePattern(){

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i ==1 && j==1){
                    System.out.print(" ");
                }else if(i+j<4){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }

    static void trianglePatternOneZero() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i >= j) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Extrapattern() {
        int k = 15;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {


                if (i == j || j == k-i-1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }

    }

}


package com.problems;

import java.util.Scanner;

public class postoneg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(ans(x));
    }

    static int ans(int a){
        if (a < 0){
            return a *-1;
        }else{
            return a *-1;
        }
    }

}

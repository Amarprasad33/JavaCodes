package com.LKcoder;

import java.util.Scanner;

public class sinSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        double y = x;
        x = Math.toRadians(x);
        double tsum= x;
        double term = x;
        int i =3;

        while(Math.abs(term) > 0.000001){

            term =-(term * (x*x / (i*(i-1))));
            tsum = tsum + term;
            i = i+2;
            System.out.println("sin("+(int)y+") ="+tsum);
        }
        System.out.println("sin("+(int)y+") ="+(int)tsum);

    }
          // sin x problem
            // sin x = x - x^3/3! + x^5/5! - x^7/7! +......
}

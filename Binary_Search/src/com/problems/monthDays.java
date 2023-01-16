package com.problems;

import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter year");
        int y = in.nextInt();
        System.out.println("enter month");
        int m = in.nextInt();
        int lp ;
        if (  y% 100 ==0 && y %400 !=0){
            lp = 1;
        }else if ( y %4 ==0){
            lp = 0;
        }else{
            lp =1;
        }
        Md(m,lp);
    }
    // to count the remaining days in that year fromm the input date

    static void Md( int month, int leap){
        switch (month){
            case 1,3,5,7,8,10,12 :
                System.out.println("days : 31");
                break;

            case 2:
                switch (leap){
                    case 0:
                        System.out.println("days: 29");
                        break;
                    case 1:
                        System.out.println("days: 28");
                        break;
                }
                break;
            case  4,6,9,11 :
                System.out.println("days : 30");
                break;
        }

    }
}
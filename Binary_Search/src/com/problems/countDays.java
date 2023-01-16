package com.problems;

import java.util.Scanner;

public class countDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter year");
        int y = in.nextInt();
        System.out.println("enter month");
        int m = in.nextInt();
        System.out.println("enter date");
        int d = in.nextInt();
        int lp ;
        if (  y% 100 ==0 && y %400 !=0){
            lp = 1;
        }else if ( y %4 ==0){
            lp = 0;
        }else{
            lp =1;
        }
       int ans = Md(m,lp,d);
        System.out.println("Number of days left " +ans);
    }
    // function to calculate the no. of days left in that year from the given date
    static int Md( int month, int leap, int d){
         int count= 0;
        if (month ==2 && leap == 0){
            count += 29 - d;
        }else if (month ==2 && leap != 0){
            count += 28 - d;
        }
        else if (month ==1 || month ==3 ||month ==5 ||month ==7 ||month ==8 || month ==10 ||month ==12 ) {
             count += 31-d;                                //1,3,5,7,8,10,12
        }else if (month ==4 || month ==6 ||month ==9 ||month ==11 ) {
            count += 30-d;                                //4,6,9,11
        }
        int nxtmonth = ++month;

        for (int i = nxtmonth; i <= 12 ; i++) {
            if (i ==2 && leap == 0){
                count += 29 ;
            }else if (i ==2 && leap != 0){
                count += 28;
            }  else if (i ==1 || i ==3 ||i ==5 ||i ==7 ||i ==8 || i ==10 ||i ==12 ) {
                count += 31;                                //1,3,5,7,8,10,12
            }else if (i ==4 || i ==6 ||i ==9 ||i ==11 ) {
                count += 30;                                //4,6,9,11
            }
        }
        return count;

    }
}
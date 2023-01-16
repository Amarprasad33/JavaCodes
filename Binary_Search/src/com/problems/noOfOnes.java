package com.problems;

public class noOfOnes {
    public static void main(String[] args) {
     // Ones(20);
     int ans= why(20);
        System.out.println(ans);


    }

    static int noOne(int num){
        int ans = 0;
        for (int i = 0; i < num; i++) {

            ans = ans *10 +1;
        }
        return ans;
    }

    static void Ones(int n) {
        int a = -1;
        for (int i = 0; i < n; i++) {

            a= -a;
            System.out.print(a+" ");
        }
    }

    static int why(int n){
        int series =1, sum =0;
        for (int i = 0; i < n; i++) {

            series = series + i;
            System.out.print(series + " ");
            sum += series;
        }
        System.out.println();
        return sum;
    }


}

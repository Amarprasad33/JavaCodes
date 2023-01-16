package com.Set1;

public class Q2DivWithoutDiv {
    public static void main(String[] args) {
        System.out.println(div(16));

    }

    static int div(int num ){
        int divisior = 0;
        while (num !=0){
            if(num%4 ==0) {
                num = num - 4;
                divisior++;
            }
        }
        return divisior;
    }
}

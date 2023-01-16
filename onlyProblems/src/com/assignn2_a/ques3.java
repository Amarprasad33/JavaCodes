package com.assignn2_a;

import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Integer> sta =new Stack<Integer>();
        System.out.println("Enter Any number");
        int x =sc.nextInt();
        int remainder;
        while(x>0) {
            remainder =x%2;
            sta.push(remainder);

            x =x/2;
        }

        System.out.println("Binary Equivalent of Your Number Is");
        while(!(sta.isEmpty())) {
            System.out.print(sta.pop());
        }

    }
}

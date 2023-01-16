package com.problems;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class countbits {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //short x = in.nextShort();
        int x = 0b001011;

        // System.out.println( countBits(x));
       // System.out.println( countBits1(x));
        System.out.println( parity(x));
        System.out.println( parity2(x));
    }
    static int parity(int x){
        int res = 0;
        int count =0;
        while(x !=0){

            res = res ^ (x&1);
            x >>=1;
            count++;
        }
        System.out.println("Approach1 :" + count);
        return res;
    }

    static int parity2(int x){
        int res = 0;
        int count =0;
        while(x !=0){

            res = res ^ 1;
            x = x &(x-1);  // discards the lowest set element
            count++;
        }
        System.out.println("Approach2 :" + count);
        return res;
    }


    static short countBits(int x){
        short numBits = 0;
        while(x !=0){

            numBits += (x&1);
            x >>>=1;
        }
        return numBits;
    }

    static int countBits1(int x){
        int y=0, count=0;

        while(x !=0){
            y = x & ~(x-1);
            x = x ^ y;
            count = count + 1;

        }
        return count;
    }

}

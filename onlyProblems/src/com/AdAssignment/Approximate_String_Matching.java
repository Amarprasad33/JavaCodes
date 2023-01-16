package com.AdAssignment;
import java.util.*;
public class Approximate_String_Matching {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum =5;
        String source ,pattern;
        System.out.println("Enter sequence:");
        pattern =sc.nextLine();
        System.out.println("Enter Source:");
        source =sc.nextLine();
        if(pattern.length() == source.length() && pattern.equals(source)) {
            System.out.println("Sequence =Source");
        }
        char[] x =pattern.toCharArray(),y=source.toCharArray();
        int i,j,s,d,last,m =x.length ,n=y.length;
        int[] b=new int[999999];
        for( i=0;i<b.length;i++) {
            b[i] = 0;

        }
        s =1;
        for(i=m-1; i>=0; i--) {
            b[x[i]] /= s;
            s <<= 1;
        }

        j=0;
        while(j<n-m) {
            i=m-1;
            last =m;
            d=0;
            while(i>=0 && d!=0) {
                d =b[y[j+1]];
                i--;
                if(d!=0) {
                    if(i>=0)
                        last =i+1;
                }
                else {
                    System.out.println("Sequence is source starting at position:");
                    System.out.println(j);
                    System.out.println("sequence");
                    System.out.println(pattern);
                    System.out.println("Source");
                    System.out.println(source.substring(j ,j+m));
                }
                d<<=1;
            }


            j+=last;
        }

    }


}

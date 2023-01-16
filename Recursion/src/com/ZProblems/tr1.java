package com.ZProblems;

import java.util.Arrays;

public class tr1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]= {-4,1,0,2,-7,8,-3,4};
        int k=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                int tem=a[i];
                a[i]=a[k];
                a[k]=tem;
                k++;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}

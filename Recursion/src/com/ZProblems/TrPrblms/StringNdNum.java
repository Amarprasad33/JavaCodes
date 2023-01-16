package com.ZProblems.TrPrblms;

public class StringNdNum {

    public static void main(String[] args) {
        System.out.println(Strr("cBz102a7p56E", 1));

        fiboI(772);

    }

    static String Strr(String inp, int val){
        char[] arr = inp.toCharArray();
        String dis = "Invalid Input";
        int ele;
        String num = "", chr = "";
        for (int i = 0; i < arr.length; i++){
            ele = arr[i];
            if (ele >= 65 && ele <= 90 || ele >= 95 && ele <= 122){
                chr += arr[i];
            }else
                num += arr[i];
        }
        if (val == 1) {
            return num;
        }else if (val == 0) {
            return chr;
        }
          return dis;
    }

    static void fiboI(long var){
        long[] arr = new long[10000];
        arr[0]= 0; arr[1] =1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == var){
                System.out.println(i);
            }
        }

    }
}

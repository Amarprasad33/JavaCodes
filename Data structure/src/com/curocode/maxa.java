package com.curocode;

public class maxa {
    public static void main(String[] args) {
        int[] arr= {2,65,8,7,69};
        
        System.out.println(max(arr));

    }

 static int max(int[] arr) {
        int maxVal = arr[0];
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] > maxVal) {
             maxVal = arr[i];
         }
     }

         return maxVal;
    }
}

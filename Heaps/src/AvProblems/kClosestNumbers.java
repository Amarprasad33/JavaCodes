package AvProblems;

import java.security.KeyPair;
import java.util.*;

public class kClosestNumbers {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };
        int k = 3; int x = 7;
        kClosest(arr, k, x);
    }


    // This code giving error because we cannot implement a pair in java in priority queue so we have to approach it differently
    public static void kClosest(int[] arr, int k, int x){

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            int absVal = Math.abs(arr[i]-x);

            maxHeap.add(new int[]{absVal, arr[i]});
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        while (maxHeap.size()>0){
            int[] ar = maxHeap.poll();
            System.out.println(ar[1]);
        }

    }

//            static class Pair<T>{
//                T fVal;
//                T sVal;
//                Pair(T f, T s){
//                    fVal = f;
//                    sVal = s;
//                }
//            }

}




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

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.fVal - x, a.fVal - x));
        for (int i = 0; i < arr.length; i++) {
            int absVal = Math.abs(arr[i]-x);

            maxHeap.add(new Pair(absVal, arr[i]));
//            System.out.println(absVal+ " -- "+ arr[i]);
            if(maxHeap.size() > k){
                Pair p = maxHeap.poll();
//                System.out.println(p.fVal+ " <--> "+ p.sVal);
            }
        }
        while (maxHeap.size()>0){
            Pair pb = maxHeap.poll();
            System.out.println(pb.sVal);
//            System.out.println(pb.fVal + " <--> " + pb.sVal);

        }

    }

            static class Pair{
                int fVal;
                int sVal;
                Pair(int fVal, int sVal){
                    this.fVal = fVal;
                    this.sVal = sVal;
                }
            }

}




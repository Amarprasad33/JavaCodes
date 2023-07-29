package AvProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class kSortedArray {
    public static void main(String[] args) {
        int[] arr = { 6, 5 ,3, 2, 8, 10, 9 };
        System.out.println(kthSmallestSortArray(arr, 3));
    }

    public static List<Integer> kthSmallestSortArray(int[] arr, int k){
        List<Integer> sorted = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k){
                sorted.add(maxHeap.poll());
            }
        }
        while(maxHeap.size() > 0) sorted.add(maxHeap.poll());
        return sorted;
    }
}

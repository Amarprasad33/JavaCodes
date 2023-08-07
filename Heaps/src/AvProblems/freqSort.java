package AvProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class freqSort {
    public static void main(String[] args) {
//        int[] arr = { 1, 1, 1, 3, 2, 2, 4 };
        int[] arr = { -1,1,-6,4,5,-6,1,4,1 };
        System.out.println(Arrays.toString(freqSortIncreasing(arr)));
    }

    public static int[] freqSortDecreasing(int[] nums) {
        if(nums.length == 0) return new int[0];

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // This priority queue is based on the values of the keys in the map
        // It is initialized like a mean heap so the less repeated numbers will be on top and deleted first
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int n: map.keySet()){
            pQueue.add(n);
//            if(pQueue.size() > k){
//                pQueue.poll();
//            }
        }
        int[] result = new int[nums.length];
        int i = 0;
        while(!pQueue.isEmpty()){
            int num = pQueue.poll();
            while(map.get(num) != 0){
                result[i++] = num;
                int k = map.get(num)-1;
                map.put(num, k);
            }
        }
        return result;
    }

    public static int[] freqSortIncreasing(int[] nums) {
        if(nums.length == 0) return new int[0];

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // This priority queue is based on the values of the keys in the map
        // It is initialized like a mean heap so the less repeated numbers will be on top and deleted first
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int n: map.keySet()){
            pQueue.add(n);
//            if(pQueue.size() > k){
//                pQueue.poll();
//            }
        }
        int[] result = new int[nums.length];
        int i = 0;
        while(!pQueue.isEmpty()){
            int num = pQueue.poll();
            while(map.get(num) != 0){
                result[i++] = num;
                int k = map.get(num)-1;
                map.put(num, k);
            }
        }

        return result;
    }
}

package AvProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topkFrequentElements_AV {

    public static void main(String[] args) {
        int[] arr = { 1,1, 5, 5, 5, 5, 5, 5, 2,2, 2, 2, 2, 2 ,3, 1, 1, 2  };
//        int[] arr = { 1, 1, 1, 2, 2, 3, 4 };
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));

        // Sorting on the based of frequency: i.e: based on repetition
        System.out.println(Arrays.toString(FrequencySort(arr)));

    }


    public static int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // This priority queue is based on the values of the keys in the map
        // It is initialized like a mean heap so the less repeated numbers will be on top and deleted first
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int n: map.keySet()){
            pQueue.add(n);
            if(pQueue.size() > k){
                pQueue.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while(!pQueue.isEmpty()){
            int num = pQueue.poll();
            result[i++] = num;
        }
        return result;
    }


    public static int[] FrequencySort(int[] nums) {
        if(nums.length == 0) return new int[1];

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // This priority queue is based on the values of the keys in the map
        // It is initialized like a mean heap so the less repeated numbers will be on top and deleted first
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int n: map.keySet()){
            pQueue.add(n);
        }
        int[] result = new int[nums.length];
        int i = 0;
        while(!pQueue.isEmpty()){
            int num = pQueue.poll();
            while(map.get(num) != 0){
                result[i++] = num;
                map.put(num, (map.get(num)) - 1);
            }
        }
        return result;
    }
}

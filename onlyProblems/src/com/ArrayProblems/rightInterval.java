package com.ArrayProblems;

import java.util.Arrays;
import java.util.*;

public class rightInterval {

    public static void main(String[] args) {
        int[][] intervals = {
                {3,4},
                {2,3},
                {1,2}
        };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }


    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        int c = 0;
        boolean flag = false;
        int end = 0;
        for(int i = 0; i < intervals.length; i++){
            end = intervals[i][intervals[i].length -1];
            flag = false;
            for(int j = 0; j < intervals.length; j++){
                if(intervals[j][0] >= end && c < ans.length && Math.abs(j -i) ==1){
                    ans[c] = j;
                    c++; flag = true;
                    break;
                }
            }
            if(flag == false && c < ans.length){
                ans[c++] = -1;
            }

        }
        return ans;

    }

    // https://leetcode.com/problems/find-right-interval/

    public int[] findRightInterval1(int[][] intervals) {
        int n = intervals.length;
        int[] arr = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = intervals[i][0];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; ++i)
            map.put(arr[i],i);
        Arrays.sort(arr);
        for(int i = 0; i < n; ++i){
            int val = binarySearch(arr,intervals[i][1]);
            if(val == -1)
                ans[i] = -1;
            else
                ans[i] = map.get(arr[val]);
        }
        return ans;
    }
    int binarySearch(int[] arr,int target){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target){
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }
}

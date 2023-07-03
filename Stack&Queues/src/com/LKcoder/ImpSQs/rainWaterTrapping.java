package com.LKcoder.ImpSQs;

import java.util.Stack;

public class rainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }


    // Rain water trapping using two arrays
    // https://leetcode.com/problems/trapping-rain-water/description/
    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];  // left array contains the maximum height building on left
        int[] right = new int[n]; // right array contains the maximum height building on right

        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];

        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += (Math.min(left[i], right[i]) - height[i]);
        }

        return ans;
    }



}

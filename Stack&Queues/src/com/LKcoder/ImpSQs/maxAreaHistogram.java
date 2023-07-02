package com.LKcoder.ImpSQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class maxAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        int n = arr.length;
        System.out.println(MAH(arr, n));
    }

    public static int MAH (int[] arr, int n){
        List<Integer> left = NSL(arr, n);
        List<Integer> right = NSR(arr, n);
        int[] width = new int[n];
        for(int i = 0; i < n; i++){
            width[i] = (right.get(i) - left.get(i)) - 1;
        }
        int[] area = new int[n];
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            area[i] = arr[i] * width[i];
            maxArea = Math.max(maxArea, arr[i] * width[i]);
        }

        return maxArea;
    }

    // This code will return the list which contains the indexes of Nearest smallest to left
    public static List<Integer> NSL(int[] arr, int n){
        Stack<int[]> stk = new Stack<>();
        List<Integer> left = new ArrayList<>();
        int pseudoIndex = -1;

        // Code for Nearest smaller to left
        for (int i = 0; i < n; i++){
            if(stk.size() == 0)
                left.add(pseudoIndex);
            else if (stk.size() > 0 && stk.peek()[0] < arr[i]) {
                left.add(stk.peek()[1]);
            } else if (stk.size() > 0 && stk.peek()[0] >= arr[i]) {
                while (stk.size() > 0 && stk.peek()[0] >= arr[i]){
                    stk.pop();
                }
                if (stk.size() == 0){
                    left.add(-1);
                }else {
                    left.add(stk.peek()[1]);
                }
            }
            stk.push(new int[]{arr[i], i});
        }

        return left;
    }


    // This code will return the list which contains the indexes of Nearest smallest to right
    public static List<Integer> NSR(int[] arr, int n){
        Stack<int[]> stk = new Stack<>();
        List<Integer> right = new ArrayList<>();
        int pseudoIndex = 7;   // Setting this to 7 just for the example used in Main function

        // Code for Nearest smaller to left
        for (int i = n-1; i >= 0; i--){
            if(stk.size() == 0)
                right.add(pseudoIndex);
            else if (stk.size() > 0 && stk.peek()[0] < arr[i]) {
                right.add(stk.peek()[1]);
            } else if (stk.size() > 0 && stk.peek()[0] >= arr[i]) {
                while (stk.size() > 0 && stk.peek()[0] >= arr[i]){
                    stk.pop();
                }
                if (stk.size() == 0){
                    right.add(-1);
                }else {
                    right.add(stk.peek()[1]);
                }
            }
            stk.push(new int[]{arr[i], i});
        }
        Collections.reverse(right);

        return right;
    }
}

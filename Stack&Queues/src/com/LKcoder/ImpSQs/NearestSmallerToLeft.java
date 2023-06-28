package com.LKcoder.ImpSQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToLeft {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int n = 5;
        System.out.println(NearestSmallerToRight(arr, n));
    }


    public static List<Integer> NearestSmallerToLeft(int[] arr, int n){
        Stack<Integer> stk = new Stack<>();
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++){
            // If stack is empty in the start
            if(stk.size() == 0)
                ls.add(-1);
            else if (stk.size() > 0 && stk.peek() < arr[i]) {   // Greater element will be at top
                ls.add(stk.peek());
            } else if (stk.size() > 0 && stk.peek() >= arr[i]) {
//               // if the top element is larger, then pop until it empties or top element is smaller than arr[i]
                while (stk.size() > 0 && stk.peek() >= arr[i]){
                    stk.pop();
                }
                // the loop will end because of one of the two conditions
                if (stk.size() == 0){
                    // it means the stack is empty and there is no smaller element to the left
                    ls.add(-1);
                }else {
                    // smaller element lies in top
                    ls.add(stk.peek());
                }
            }
            stk.push(arr[i]);
        }
        return ls;
    }

    // OUTPUT: -1, 4, -1, 2, 2



    public static List<Integer> NearestSmallerToRight(int[] arr, int n){
        Stack<Integer> stk = new Stack<>();
        List<Integer> ls = new ArrayList<>();

        for (int i = n-1; i>=0; i--){
            // If stack is empty in the start
            if(stk.size() == 0)
                ls.add(-1);
            else if (stk.size() > 0 && stk.peek() < arr[i]) {   // Greater element will be at top
                ls.add(stk.peek());
            } else if (stk.size() > 0 && stk.peek() >= arr[i]) {
//               // if the top element is larger, then pop until it empties or top element is smaller than arr[i]
                while (stk.size() > 0 && stk.peek() >= arr[i]){
                    stk.pop();
                }
                // the loop will end because of one of the two conditions
                if (stk.size() == 0){
                    // it means the stack is empty and there is no smaller element to the right
                    ls.add(-1);
                }else {
                    // smaller element lies in top
                    ls.add(stk.peek());
                }
            }
            stk.push(arr[i]);
        }
        Collections.reverse(ls);
        return ls;
    }

    // OUTPUT: 2, 2, -1, 8, -1


}

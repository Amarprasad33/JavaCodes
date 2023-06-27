package com.LKcoder.ImpSQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestGreaterToRight {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int n = 4;
        System.out.println(NearestGreaterToLeft(arr, n));
    }

    // Optimal approach to solve it using stacks
    public static List<Integer> NGT(int[] arr, int n){
        Stack<Integer> stk = new Stack<>();
        List<Integer> ls = new ArrayList<>();

        for (int i = n-1; i>=0; i--){
            // If stack is empty in the start
            if(stk.size() == 0)
                ls.add(-1);
            else if (stk.size() > 0 && stk.peek() > arr[i]) {   // Greater element will be at top
                ls.add(stk.peek());
            } else if (stk.size() > 0 && stk.peek() <= arr[i]) {
//               // if the top element is smaller the pop until it empties or top element is greater than arr[i]
                while (stk.size() > 0 && stk.peek() <= arr[i]){
                    stk.pop();
                }
                // the loop will end because of one of the two conditions
                if (stk.size() == 0){
                    // it means the stack is empty and there is no greater element to the right
                    ls.add(-1);
                }else {
                    // greater element lies in top
                    ls.add(stk.peek());
                }
            }
            stk.push(arr[i]);
        }
        Collections.reverse(ls);
        return ls;
    }


    public static List<Integer> NearestGreaterToLeft(int[] arr, int n){
        Stack<Integer> stk = new Stack<>();
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++){
            // If stack is empty in the start
            if(stk.size() == 0)
                ls.add(-1);
            else if (stk.size() > 0 && stk.peek() > arr[i]) {   // Greater element will be at top
                ls.add(stk.peek());
            } else if (stk.size() > 0 && stk.peek() <= arr[i]) {
//               // if the top element is smaller, then pop until it empties or top element is greater than arr[i]
                while (stk.size() > 0 && stk.peek() <= arr[i]){
                    stk.pop();
                }
                // the loop will end because of one of the two conditions
                if (stk.size() == 0){
                    // it means the stack is empty and there is no greater element to the left
                    ls.add(-1);
                }else {
                    // greater element lies in top
                    ls.add(stk.peek());
                }
            }
            stk.push(arr[i]);
        }
        return ls;
    }

}

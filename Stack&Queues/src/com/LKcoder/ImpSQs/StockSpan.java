package com.LKcoder.ImpSQs;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        List<Integer> NGL_Indexes = NGL_Index_For_Stock_Span(arr, 7);
        System.out.println(NGL_Indexes);
        List<Integer> ans = Stock_Span(arr, NGL_Indexes);
        System.out.println(ans);

    }

    public static List<Integer> Stock_Span(int[] arr, List<Integer> NGL_indexes){
        for (int i = 0; i < NGL_indexes.size(); i++){
            NGL_indexes.set(i, i - NGL_indexes.get(i));
        }
        return NGL_indexes;
    }


    public static List<Integer>   NGL_Index_For_Stock_Span(int[] arr, int n){
        // Now we are using a stack which contains an array of length 2
        // first ele of array contains the elements itself and 2nd element contains
        // the index of the next greater element
        Stack<int[]> stk = new Stack<>();
        List<Integer> ls = new ArrayList<>();


        for (int i = 0; i < n; i++){
            // If stack is empty in the start
            if(stk.size() == 0)
                ls.add(-1);
            else if (stk.size() > 0 && stk.peek()[0] > arr[i]) {   // Greater element will be at top
                ls.add(stk.peek()[1]);
            } else if (stk.size() > 0 && stk.peek()[0] <= arr[i]) {
//               // if the top element is smaller, then pop until it empties or top element is greater than arr[i]
                while (stk.size() > 0 && stk.peek()[0] <= arr[i]){
                    stk.pop();
                }
                // the loop will end because of one of the two conditions
                if (stk.size() == 0){
                    // it means the stack is empty and there is no greater element to the left
                    ls.add(-1);
                }else {
                    // greater element lies in top
                    ls.add(stk.peek()[1]);
                }
            }
            stk.push(new int[]{arr[i], i});
        }
        // This list will return the indexes which represents the index of NGL elements
        return ls;
    }

}

package com.LKcoder.ImpSQs;

import java.util.Stack;

public class minElementSpaceOrderN {
    public static void main(String[] args) {
        push(18);
        push(39);
        push(2);
        push(99);
        System.out.println(getMin());
    }

    // This min stack solution has O(n) space and time complexity
    public static Stack<Integer> s = new Stack<>();  // This stack is for storing the given elements
    public static Stack<Integer> ss = new Stack<>(); // This is a supporting stack for storing min elements

    public static int getMin(){
        if(ss.size() == 0)
            return -1;
        return ss.peek();
    }


    public static void push(int a){
        s.push(a);
        if(ss.size() == 0 || ss.peek() >= a)
            ss.push(a);
    }

    public static int pop(){
        if(s.size() == 0)
            return -1;
        int ans = s.peek();
        s.pop();
        if(ss.peek() == ans)
            ss.pop();
        return ans;
    }
}

package com.LKcoder.ImpSQs;

import java.util.Stack;

public class minElementSpaceOrder1 {
    public static void main(String[] args) {

    }
    public static int minEle = Integer.MAX_VALUE;
    // This min stack solution has O(1) space and time complexity
    public static Stack<Integer> s = new Stack<>();  // This stack is for storing the given elements

    public static int getMin(){
        if(s.size() == 0)
            return -1;
        return minEle;
    }


    public static void push(int x){
        if(s.size() == 0){
            s.push(x);
            minEle = x;
        }else {
            if (x >= minEle)
                s.push(x);
            else if (x < minEle){
                s.push(2*x - minEle);
                minEle = x;
            }
        }
    }

    public static int pop(){
        int del = -1;
        if(s.size() == 0)
            return -1;
        else {
            if(s.peek() >= minEle){
                del = s.peek();
                s.pop();
            }
            else if (s.peek() < minEle){
                del = minEle;
                minEle = 2*minEle - s.peek();
                s.pop();
            }
        }
        return del;
    }

    public static int top(){
        if (s.size() == 0){
            return -1;
        }else {
            if (s.peek() >= minEle)
                s.peek();
            else if(s.peek() < minEle)
                return minEle;
        }
        return -1;
    }
}

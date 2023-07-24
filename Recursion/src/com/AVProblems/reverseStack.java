package com.AVProblems;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {

    }

    static void reverse(Stack<Integer> stk){
        if(stk.size() == 0){
            return;
        }

        int temp = stk.peek();
        stk.pop();
        reverse(stk);
        insert(stk, temp);
        return;
    }


    static void insert(Stack<Integer> stk, int ele){
        if(stk.size() == 0){
            stk.push(ele);
            return;
        }

        int val = stk.peek();
        stk.pop();
        insert(stk, ele);
        stk.push(val);
    }
}

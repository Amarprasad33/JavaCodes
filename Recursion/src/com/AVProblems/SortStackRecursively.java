package com.AVProblems;

import java.util.List;
import java.util.Stack;

public class SortStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(0);
        stk.push(1);
        stk.push(5);
        System.out.println(stk);
        sortStack(stk);
        System.out.println(stk);

    }

    static void sortStack(Stack<Integer> stk){
        if (stk.size() == 1){
            return;
        }

        int temp = stk.peek();
        stk.pop();
        sortStack(stk);
        insert(stk, temp);

    }

    static void insert(Stack<Integer> stk, int ele){
        if(stk.size() == 0 || stk.peek() <= ele){
            stk.add(ele);
            return;
        }

        int val = stk.peek();
        stk.pop();
        insert(stk, ele);
        stk.push(val);
    }
}

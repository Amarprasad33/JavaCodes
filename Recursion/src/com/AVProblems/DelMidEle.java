package com.AVProblems;

import java.util.Stack;

public class DelMidEle {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println(stk);
        midDelete(stk, stk.size());
        System.out.println(stk);
    }

    static Stack<Integer> midDelete(Stack<Integer> s, int size){
        if(s.size() == 0) return s;

        int k = (size/2) + 1;
        solve(s, k);
        return s;

    }

    static void solve(Stack<Integer> s, int k){
        if(k == 1){
            s.pop();
            return;
        }

        int temp = s.peek();
        s.pop();
        solve(s, k-1);
        s.push(temp);
    }


}

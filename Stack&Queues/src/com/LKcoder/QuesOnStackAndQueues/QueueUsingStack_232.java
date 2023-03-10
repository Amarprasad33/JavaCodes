package com.LKcoder.QuesOnStackAndQueues;

import com.sun.source.tree.WhileLoopTree;

import java.util.Stack;

public class QueueUsingStack_232 {
    private Stack<Integer> stk1 ;
    private Stack<Integer> stk2 ;
    public static void main(String[] args) {

    }

    public void QueueUsingStack(){
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }



    public void push(int x) {
        stk1.push(x);
    }

    public int pop() {
        while (!stk1.empty()){
            stk2.push( stk1.pop());
        }
        int removed = stk2.pop();
        while (!stk2.empty()){
            stk1.push(stk2.pop());
        }
        return removed;
    }

    public int peek() {
        while (!stk1.empty()){
            stk2.push( stk1.pop());
        }
        int peeked = stk2.peek();
        while (!stk2.empty()){
            stk1.push(stk2.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return stk1.isEmpty();
    }


}

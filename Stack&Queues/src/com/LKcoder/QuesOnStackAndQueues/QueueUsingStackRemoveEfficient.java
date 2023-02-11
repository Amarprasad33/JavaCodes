package com.LKcoder.QuesOnStackAndQueues;

import java.util.Stack;

public class QueueUsingStackRemoveEfficient {
    private Stack<Integer> stk1 ;
    private Stack<Integer> stk2 ;
    public static void main(String[] args) {

    }

    public void QueueUsingStack(){
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }



    public void push(int x) {
        while (!stk1.empty()){
            stk2.push( stk1.pop());
        }
        stk1.push(x);
        while (!stk2.empty()){
            stk1.push(stk2.pop());
        }
    }

    public int pop() {
        return stk1.pop();
    }

    public int peek() {
       return stk1.peek();
    }

    public boolean empty() {
        return stk1.isEmpty();
    }
}

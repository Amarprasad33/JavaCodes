package com.LKcoder.stackQs;
import java.util.*;
public class SortedInsert_sortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.push(3);
      //  sortedInsert(stack, 3);
        sortStack(stack);
        dispUsingRecursion(stack);


    }
    public static void sortStack(Stack<Integer> stk) {
        int temp;
        if (stk.isEmpty() == false) {
            temp = stk.pop();
            sortStack(stk);
            sortedInsert(stk, temp);
          //  stk.push(temp);
        }
    }
    public static void sortedInsert(Stack<Integer> stk, int element) {
        int temp;
        if (stk.isEmpty() || element > stk.peek()) {
            stk.push(element);
            return;
        }
        temp = stk.pop();
        sortedInsert(stk, element);
        stk.push(temp);
    }

    static void disp(Stack<Integer> stk){    // Prints element from top to bottom
        if (stk.isEmpty()){
            System.out.println("Stack is  already empty");
            return;
        }
        while(!stk.empty()){
            int x = stk.peek();
            stk.pop();
            System.out.print(x + ",");
        }
    }
    static void dispUsingRecursion(Stack<Integer> stk){
        if (stk.isEmpty()){
            return;
        }
            int x = stk.peek();
            stk.pop();
            System.out.print(x + ",");
            dispUsingRecursion(stk);
            stk.push(x);

    }


}

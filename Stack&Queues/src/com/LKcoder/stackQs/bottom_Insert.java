package com.LKcoder.stackQs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class bottom_Insert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(6);
     //   stack.push(3);
        System.out.println(stack);
          bottomInsert(stack, 3);

         //  disp(stack);  // If we use this function it will delete all elements
          System.out.println("In bottom to top order" + stack);

          reverseStack(stack);

        //  disp(stack);
        System.out.println("After reverse" + stack);
        reverseStackTillk(stack, 3);
        System.out.println(stack);

    }

    static void reverseStack(Stack<Integer> stk){  // Time complexity : O(n)
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while (!stk.isEmpty()){
            queue.add(stk.pop());
        }
        while (!queue.isEmpty()){
            stk.push(queue.remove());
        }
    }

    static void reverseStackTillk(Stack<Integer> stk, int k){  // Time complexity : O(n)
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int i = 0;
        while (!stk.isEmpty() && i < k){
            queue.add(stk.pop());
            i++;
        }
        while (!queue.isEmpty()){
            stk.push(queue.remove());
        }
    }


     static void bottomInsert(Stack<Integer> stack, int ele) {
        int temp ;
        if (stack.isEmpty()){
            stack.push(ele);
            return;
        }

        temp = stack.pop();
        bottomInsert(stack, ele);
        stack.push(temp);
    }

    static void disp(Stack<Integer> stk){  // Prints element from top to bottom
        if (stk.isEmpty()){
            System.out.println("Stack is  already empty");
            return;
        }
        while(!stk.empty()){
            System.out.print(stk.pop() + ",");
        }
    }


}

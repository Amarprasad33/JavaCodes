package com.LKcoder.stacks;

public class StackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack();

        stack.push(23);
        stack.push(26);
        stack.push(2);
        stack.push(47);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
      //  System.out.println(stack.pop());

    }
}

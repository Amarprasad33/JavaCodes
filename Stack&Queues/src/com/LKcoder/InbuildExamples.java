package com.LKcoder;
import java.util.*;
public class InbuildExamples {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack();
//        stack.push(12);
//        stack.push(45);
//        stack.push(36);
//        stack.push(7);
//        stack.push(6);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//    //    System.out.println(stack.pop());       // after once emptied the stack it cannot do pop operation on stack anymore
//
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(18);
//        queue.add(2);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(690);
//        deque.addLast(55);
//        deque.addFirst(4);
//        System.out.println(deque);
        // etc etc

        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
        if(nums.length < 1){
            return  new int[]{};
        }

        int[] ans = new int[nums.length];
        int k = 0, prod = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    prod *= nums[j];
                }
            }
            ans[i] = prod;
            prod = 1;
        }
        return ans;
    }

    // A better solution with O(n) approach
    // https://leetcode.com/problems/product-of-array-except-self/solutions/65622/simple-java-solution-in-o-n-without-extra-space/
    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }


}

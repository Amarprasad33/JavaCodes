package com.LKcoder.stackQs;
import java.util.Stack;

public class lonContBalParen {

    public static void main(String[] args) {
        String expn = "())((()))(())()(()";
        int size = expn.length();
        int value = longestContBalParen(expn, size);
  //     int value2 = maxbalancedprefix(expn, size);
        System.out.println("longestContBalParen " + value);
    }

    public static int longestContBalParen(String string, int size) {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(-1);
        int length = 0;

        for (int i = 0; i < size; i++) {
            if (string.charAt(i) == '(')
                stk.push(i);
            else            // string[i] == ')'
            {
                stk.pop();
                if (stk.size() != 0)
                    length = Math.max(length, i - stk.peek());
                else
                    stk.push(i);
            }
        }
        return length;
    }


    //   static int maxbalancedprefix(String str, int n)
//    {
//        int sum = 0;
//        int maxi = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            if (str.charAt(i) == '(')
//                sum += 1;
//
//            else
//                sum -= 1;
//
//            if (sum < 0) {
//                sum = 0;
//            }
//
//            if (sum == 0) {
//                maxi = (i + 1) - maxi;
//                sum = 0;
//                if (sum > maxi){
//                    maxi = sum;
//                }
//            }
//        }
//
//        return maxi;
//    }



}

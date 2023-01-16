package com.LKcoder.stackQs;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class maxDepthParenthesis {

    public static void main(String[] args) {
        String expn = "((((A)))((((BBB()))))()()()())";
        int value = maxDepth(expn);
        System.out.println("Max depth parenthesis is : " + value);
    }

    static int maxDepth(String exp){
        Stack<Character> stk = new Stack<>();
        int depth = 0;
        int maxDepth = 0;
        char ch ;
        for (int i = 0; i < exp.length(); i++) {
            ch = exp.charAt(i);

            if (ch == '('){
                stk.push(ch);
                depth += 1;
            }else if (ch == ')'){
                stk.pop();
                depth -= 1;
            }

            if (depth > maxDepth){
                maxDepth = depth;
            }
        }
        return maxDepth;
    }
}

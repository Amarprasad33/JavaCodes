package com.LKcoder.stackQs;
import java.util.Stack;


public class BalancedParenthesis {

    public static void main(String[]args) {
        String s="{}[]()";
        System.out.print("Balanced Parenthesis : " + isBalancedParenthesis(s));
    }
        // Way 1
    public static boolean balanced(String s) {
        Stack<Character> stack=new Stack<Character> ();
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{')   // Example 1
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        // Check Empty Stack
        return stack.isEmpty();
    }

        // Way 2
    public static boolean isBalancedParenthesis(String exp) {
       Stack<Character> stk = new Stack<>() ;

       for (char ch : exp.toCharArray()){
           switch (ch){
               case '(':
               case '{':
               case '[':
                   stk.push(ch);
                   break;

               case ')' :
                   if (stk.pop() != '(')
                       return false;
                   break;

               case '}':
                   if (stk.pop() != '{')
                       return false;
                   break;

               case ']':
                   if (stk.pop() != '[')
                       return false;
                   break;
           }
       }

       return stk.isEmpty();
    }

}

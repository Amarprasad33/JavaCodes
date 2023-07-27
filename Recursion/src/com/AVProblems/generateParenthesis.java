package com.AVProblems;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(generateParenthesis(n));
    }


    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }

    public static void helper(List<String> ls, String curr, int left, int right, int max){
        if(curr.length() == max*2){
            ls.add(curr);
            return;
        }
        if(left < max)
            helper(ls, curr+'(', left+1, right, max);
        if(right < left)
            helper(ls, curr+')', left, right+1, max);
    }
}

package com.LKcoder.hackerRank;

public class repeatString {
    public static void main(String[] args) {
        String as = "aaabccddd";
        System.out.println(superReducedString(as));
    }

    // https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true
    public static String superReducedString(String s) {
        StringBuilder ss = new StringBuilder(s);
        for (int i = 1; i < ss.length(); i++) {
            if(ss.charAt(i) == ss.charAt(i-1)){
                ss.delete(i-1, i+1);
            }
        }
        if(ss.length() == 0) return "Empty String";

        return ss.toString();
    }
}

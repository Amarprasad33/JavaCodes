package com.ArrayProblems;

public class noOfWordsinString {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }


    // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < sentences.length; i++){
            String str = sentences[i];
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ' '){
                    count += 1;
                }
            }
            count += 1;   // Incrementing one time because the no. of words in a string = no. of spaces +1
            if(count > max){
                max = count;
            }
        }

        return max;
    }
}

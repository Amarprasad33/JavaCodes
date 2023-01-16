package com.ArrayProblems;
import java.util.*;
public class removeAnagram {




    public static void main(String[] args) {
        String[] words  = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams2(words));
    }

    public static List<String> removeAnagrams(String[] words) {
        if(words.length == 0){
            return null;
        }
        List<String> ans = new ArrayList<>();
        List<String> copy = new ArrayList<>();
        int same = 0;
        int sum1 = 0;
        boolean flag = false;

        for(int i = 0; i< words.length; i++){
            copy.add(words[i]);
            int sum2 = 0;
            for(int j = 0; j < words[i].length(); j++){

                int num = words[i].charAt(j) - '0';
                sum2 += num;

            }
            if(i == 0){
                sum1 = sum2;
            }
            if(i != 0 && sum1 == sum2 && sum2 != same ){
                same = sum2;
                ans.add(words[i - 1]);
                flag = true;
            }
                 sum1 = sum2;
        }
        if(!flag){
            return copy;
        }
        return ans;
    }


    // https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/

    public static List<String> removeAnagrams2(String[] words) {
        String prev ="";
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            if(!curr.equals(prev)){
                li.add(words[i]);
                prev=curr;
            }
        }
        return li;
    }
}

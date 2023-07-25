package com.AVProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class subsetsPowerSubsetsSubseq {
    public static void main(String[] args) {
//        String inp = "abc";
        String inp1 = "aab";
        String op = "";
        HashSet<String> set = new HashSet<>();
//        subset(op, inp1);
        List<String> ans  = new ArrayList<>();
                ans = subsetNoRepeat(op, inp1, set);
        System.out.println(ans);
    }


    static void subset(String p, String up){
        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
//        ArrayList<String> left = subset(p + ch, up.substring(1));
//        ArrayList<String> right = subset(p, up.substring(1));
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

//        left.addAll(right);
//        return left;
    }

    static ArrayList<String> subsetNoRepeat(String p, String up, HashSet<String> set){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!set.contains(p)){
                list.add(p);
                set.add(p);
            }else return list;
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetNoRepeat(p + ch, up.substring(1), set);
        ArrayList<String> right = subsetNoRepeat(p, up.substring(1), set);

        left.addAll(right);
        return left;
    }

   // https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/
   public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
       backtrack(list, new ArrayList<>(), nums, 0);
       return list;
   }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

}

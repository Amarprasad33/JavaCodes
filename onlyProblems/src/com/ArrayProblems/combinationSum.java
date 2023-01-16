package com.ArrayProblems;
import java.util.*;
public class combinationSum {



    // https://leetcode.com/problems/combination-sum/
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int tar = 7;
        System.out.println(combinationSum(arr,tar));


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length < 1){
            return null;
        }
        List<List<Integer>> list = new ArrayList();
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, curr, 0, 0, list );


        return list;
    }

    public static void helper(int[] candidates, int target, List<Integer> currComb, int currSum, int currIndex, List<List<Integer>> ans ){
        if(currSum > target){
            return;
        }
        if(currSum == target){
            ans.add(new ArrayList(currComb));
            return;
        }

        for (int i = currIndex; i < candidates.length; i++){
            currComb.add(candidates[i]);
            currSum += candidates[i];
            helper(candidates, target, currComb, currSum, i, ans);
            currComb.remove(currComb.size() -1);
            currSum -= candidates[i];
        }
    }


}

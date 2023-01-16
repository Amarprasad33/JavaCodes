package com.LKcoderProblems;

import java.util.ArrayList;
import java.util.List;



//Disappeared Numbers In Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Asked in Google
public class DisNuminArray {


    public List<Integer> findDisappearedNumbers(int[] nums) {

            int i  = 0;
            while(i < nums.length){
                int correct = nums[i] -1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    i++;
                }
            }
            //Just find the missing Numbers
           List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index + 1);
            }
        }
       return ans;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

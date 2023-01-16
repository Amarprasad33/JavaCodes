package com.Qs;
import java.util.*;
public class twoSome {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    // Not passing some edge cases like 3,2,3 & target = 6
    public static int[] twoSumq(int[] nums, int target) {
        if(nums.length == 2){
            return new int[]{0,1};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);

        int st = 0, en = nums.length-1, sum = 0;
        while(st < en){
            sum = nums[st] + nums[en];
            if(sum == target)
                return new int[]{map.get(nums[st]), map.get(nums[en])};
            if(sum < target)
                st++;
            else
                en--;
        }
        return new int[]{-1, -1};
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}

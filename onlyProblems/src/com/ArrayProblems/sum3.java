package com.ArrayProblems;
import java.util.*;
public class sum3 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();

   //  Inserting a list inside a list
//        for (int i = 0; i < 3 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                ls.add(j);
//
//            }
//            list.add(new ArrayList(ls));
//            ls.removeAll(ls);
//        }
//
//        System.out.println(list);
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));


    }

    // 3Sum problem
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++ ){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high){
                    if (nums[low] + nums[high] == sum){
                        ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low ++;
                        while (low < high && nums[high] == nums[high - 1]) high --;
                        low ++;
                        high --;
                    } else if(nums[low] + nums[high] > sum){
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }

        return ans;
    }
}

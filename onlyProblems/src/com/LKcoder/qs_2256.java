package com.LKcoder;

public class qs_2256 {

    public static void main(String[] args) {
        int[] arr = {2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(arr));
    }

    // Own code^_^: but not working with large input arrays
    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length, diff;
        if(n <= 1){
            return 0;
        }
        int ans = Integer.MAX_VALUE, index =0;
        for(int i = 0; i< n; i++){
            diff = abs_diff(nums, i+1, n);
            if(diff < ans) {
                ans = diff;
                index = i;
            }
        }

        return index;
    }

    public static int abs_diff(int[] nums, int lim, int length){
        int i , sum1 = 0, sum2 = 0, avg1, avg2 = 0, count = 0;

        for(i = 0; i < lim; i++ ){
            sum1 += nums[i];
            count++;
        }
        avg1 = (int)Math.floor(sum1/count);
        count = 0;
        for(int j = i; j < length; j++ ){
            sum2 += nums[j];
            count++;
        }
        if(count != 0)
            avg2 = (int)Math.floor(sum2/count);

        int absDiff = Math.abs(avg2 - avg1);
        return absDiff;
    }


    ///================ Prefix Sum method
    public static int qs_leet2256_prefixSum(int[] nums){
        int N = nums.length, id = 0;
        long min = Integer.MAX_VALUE;
        long[] pre = new long[N];
        pre[0] = nums[0];
        for(int i = 1; i < N; i++)
            pre[i] = pre[i-1]+nums[i];
        for(int i = 0; i < N-1; i++)
        {
            long diff = (long)(Math.abs(Math.round(pre[i]/(i+1) - Math.round((pre[N-1]-pre[i])/(N-i-1)))));
            if(diff < min)
            {
                id = i;
                min = diff;
            }
        }
        if(min > pre[N-1]/N) // Taking all on the first/left
            return N-1;
        return id;
    }



}

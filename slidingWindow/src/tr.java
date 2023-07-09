public class tr {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2};
        int target = 1;
        System.out.println(maximumJumps(arr, target));
    }

    public static int maximumJumps(int[] nums, int target) {
        int count = 0, n = nums.length;
        int[] dp = new int[n];
        for(int k = 0; k < n; k++){
            dp[k] = -1;
        }
        dp[0] = 0;
        for(int i = 1; i<n; i++){
            for(int j = 0; j<i; j++){
                if(Math.abs(nums[i] - nums[j]) <= target && dp[j] != -1)
                    dp[i] = Math.max(dp[i], 1+dp[j]);
            }
        }


        return dp[n-1];
    }
}

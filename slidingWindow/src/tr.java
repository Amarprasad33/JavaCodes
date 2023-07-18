public class tr {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2};
        int target = 1;
//        System.out.println(maximumJumps(arr, target));
//        int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr2 = { 1, 0, 1, 1, 1};
        System.out.println(searchInRotatedSortedArrayWithDuplicates(arr2, 0));
    }

//    public static int maximumJumps(int[] nums, int target) {
//        int count = 0, n = nums.length;
//        int[] dp = new int[n];
//        for(int k = 0; k < n; k++){
//            dp[k] = -1;
//        }
//        dp[0] = 0;
//        for(int i = 1; i<n; i++){
//            for(int j = 0; j<i; j++){
//                if(Math.abs(nums[i] - nums[j]) <= target && dp[j] != -1)
//                    dp[i] = Math.max(dp[i], 1+dp[j]);
//            }
//        }
//        return dp[n-1];
//    }

    // https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    // Search for target in rotated sorted array
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target <= nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }else{
                if(target >= nums[mid] && target <= nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
    public static boolean searchInRotatedSortedArrayWithDuplicates(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return true;

            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target <= nums[mid])
                    end = mid;
                else
                    start = mid+1;
            } else{
                if(target >= nums[mid] && target <= nums[end])
                    start = mid+1;
                else
                    end = mid;
            }
        }
        return false;
    }
}

package Searching;

public class tr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
    //    System.out.println(findPeakElement(arr));
        int[] str = {4,5,6,7,0,1,2};
        int[] str2 = {3,1,2};
        System.out.println(findMinEle_inRotatedArray(str2));
    }

   // https://leetcode.com/problems/find-peak-element/
    // 162
    public static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while(s < e){
            int m = s + (e-s)/2;

            if(s == e){
                return s;

            }else if(s+1 == e){
                if(nums[s] > nums[e]) return s;
                return e;
            }

            if(nums[m] > nums[m+1] && nums[m] > nums[m-1]){
                return m;
            } else if(nums[m-1] < nums[m] && nums[m] < nums[m+1] ){
                s = m + 1;
            } else{
                e = m - 1;
            }
        }

        return 0;
    }



// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    // No. - 153
    public static int findMinEle_inRotatedArray(int[] nums) {
        int s = 0;
        int e  = nums.length -1;

        int min = Integer.MAX_VALUE;

        while (s <= e) {
            if (s == e  ) {
                if (nums[s] < min){
                    return nums[s];
                }else{
                    return min;
                }

            }
            int mid = s + (e - s)/2;
            if (nums[mid] < min){
                min = nums[mid];
            }
            if (nums[e] < nums[mid]){
                s = mid + 1;
            } else if (nums[e] > nums[mid]){
                e = mid - 1;
            }
        }
        return min;
    }
}

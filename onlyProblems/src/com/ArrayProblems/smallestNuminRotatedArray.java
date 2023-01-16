package com.ArrayProblems;

public class smallestNuminRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(arr));
    }

    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
    public static int findMin(int[] nums) {
        int s = 0;
        int e  = nums.length -1;

        int min = Integer.MAX_VALUE;

        while (s <= e) {
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




    // To find the k th smallest number in a 2d array
    // https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
    // discussion solution link
    /// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/discuss/85173/Share-my-thoughts-and-Clean-Java-Code
}

package com.curocode;

public class MountainArray {
    public static void main(String[] args) {

    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
             int start = 0;
             int end = arr.length -1;

             while(start < end ){
                 int mid = start + (end - start )/2;
                 if (arr[mid] > arr[mid +1]) {
                     //you are at the descending part of the array
                     //but look at the left
                     //this is why end != mid -1
                     end = mid;
                 }else{
                     //you are at the ascending part of the array
                     start = mid +1; // because we know that mid +1 > mid element
                                    // so we are ignoring the mid (element) here
                 }
             }
        //in the end , start == end and pointing to the same number because of the two checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;   // or return end as both are equal
    }
}

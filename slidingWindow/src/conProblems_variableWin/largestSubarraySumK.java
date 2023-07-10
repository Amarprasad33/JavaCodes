package conProblems_variableWin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class largestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 1, 1, 2, 1, 2, 3, 5, 2, 1 };
        System.out.println(largest_Subarray_of_sizeK(arr, 8));
    }
    // Returns the size of the longest sub array whose sum is = k
    public static int largest_Subarray_of_sizeK(int[] arr, int k){
        int sum = 0, i = 0, j = 0, max = 0;
        int size = arr.length;
        Queue<Integer> str = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        while (j < size){
            sum = sum + arr[j];
            if(sum < k)
                j++;
            else if (sum == k){
                max = Math.max(max, j-i+1);

                j++;
            }else if (sum > k){
                while(sum > k){
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}

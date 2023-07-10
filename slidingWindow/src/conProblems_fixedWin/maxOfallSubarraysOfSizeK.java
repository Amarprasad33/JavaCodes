package conProblems_fixedWin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class maxOfallSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        System.out.println(maxOfAllSubarrayOfSizeK(arr, 3));
    }

    public static List<Integer> maxOfAllSubarrayOfSizeK(int[] arr, int k){
        int sum = 0, i = 0, j = 0, max = 0;
        int size = arr.length;
        Queue<Integer> str = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        while (j < size){
            while ( str.size() > 0 && str.peek() < arr[j]){
                str.poll();
            }
            str.add(arr[j]);
            if(j - i + 1 < k)
                j++;
            else if (j-i+1 == k){
                ans.add(str.peek());

                if (str.peek() == arr[i])
                    str.poll();
                j++;
                i++;
            }
        }
        return ans;
    }
}

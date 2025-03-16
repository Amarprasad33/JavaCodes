package conProblems_fixedWin;

import java.util.*;

public class maxOfallSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
//        int[] arr = { 1, 3, 1, 2, 0, 5 };

        System.out.println(maxOfAllSubarrayOfSizeK(arr, 3));
    }

    // Using a Deque because it was failing in a specific
    // case which is provided in the second input
    public static List<Integer> maxOfAllSubarrayOfSizeK(int[] arr, int k){
        int sum = 0, i = 0, j = 0, max = 0;
        int size = arr.length;
        Deque<Integer> quw = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        while (j < size){
            while ( quw.size() > 0 && quw.peekLast() < arr[j]){
                quw.pollLast();
            }
            quw.add(arr[j]);
            if(j - i + 1 < k)
                j++;
            else if (j-i+1 == k){
                ans.add(quw.peek());

                if (quw.peek() == arr[i])
                    quw.poll();
                j++;
                i++;
            }
        }
        return ans;
    }


}

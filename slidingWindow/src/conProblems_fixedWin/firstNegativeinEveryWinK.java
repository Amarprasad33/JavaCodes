package conProblems_fixedWin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class firstNegativeinEveryWinK {
    public static void main(String[] args) {
        int[] wn = { 12, -1, -7, 8, -15, 30, 16, 28 };
        System.out.println(firstNegative(wn, 3));
        System.out.println(firstNegative(wn, 3).size());  // The size of the list which is ans is n-k+1

    }

    public static List<Integer> firstNegative(int[] arr, int k){
        int sum = 0, i = 0, j = 0, max = 0;
        int size = arr.length;
        Queue<Integer> str = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        while (j < size){
            if(arr[j] < 0)
                str.add(arr[j]);
            if(j - i + 1 < k)
                j++;
            else if (j-i+1 == k){
                if (str.isEmpty())
                    ans.add(0);
                else
                    ans.add(str.peek());

                if (str.contains(arr[i]))
                    str.poll();
                j++;
                i++;
            }
        }
        return ans;
    }

}

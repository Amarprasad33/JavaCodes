package dailyQs;

import java.util.Arrays;
import java.util.HashSet;

public class qs_2007 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 0, 1};
        System.out.println(Arrays.toString(findOriginalArray(arr)));
    }

    // https://leetcode.com/problems/find-original-array-from-doubled-array/submissions/
    // 2007
    public static int[] findOriginalArray(int[] changed) {
        int[] ans = new int[changed.length/2];
        int[] emp = {};
        int counter = 0, j = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < changed.length; i++){
            if(i < changed.length/2){
                set.add(changed[i]);
            }

            if(i >= changed.length/2 && set.contains(changed[i]/2)  ){
                counter++;
                ans[j++] = changed[i]/2;
            }
        }
        if(counter == changed.length/2)
            return ans;

        return emp;
    }

}

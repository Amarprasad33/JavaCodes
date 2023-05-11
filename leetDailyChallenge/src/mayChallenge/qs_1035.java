package mayChallenge;
import  java.util.*;
public class qs_1035 {

    //  https://leetcode.com/problems/uncrossed-lines/
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        HashMap<String, Integer> map = new HashMap<>();
        return  helper(nums1, 0, nums2, 0, map);
    }

    public int helper(int[] a, int i, int[] b, int j, HashMap<String, Integer> mp){
        if(i == a.length || j == b.length) return 0;
        String key = i + "secret" + j;
        int count = 0;
        if(mp.containsKey(key)) return mp.get(key);
        if(a[i] == b[j]){
            count = 1+helper(a, i+1, b, j+1, mp);
        } else{
            count += Math.max(helper(a, i+1, b, j, mp), helper(a, i, b, j+1, mp));
        }
        mp.put(key, count);
        return count;
    }

}

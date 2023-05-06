package mayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qs_1498 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/

    public static int numSubseq(int[] nums, int target) {
        int ans = 0, mod = 1000000007, l = 0, r = nums.length-1;
        List<Integer> pow = new ArrayList<>();
        pow.add(1);
        for (int i = 1; i <= nums.length; i++) {
            pow.add((pow.get(i-1) << 1) % mod);
        }

        Arrays.sort(nums);
        while (l <= r){
            if(nums[l] + nums[r] > target){
                r--;
            } else {
                ans = (ans + pow.get(r - l)) % mod;
                l++;
            }
        }
        return  ans;

    }


}

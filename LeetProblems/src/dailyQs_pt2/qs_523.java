package dailyQs_pt2;
import java.util.*;
public class qs_523 {

    public static void main(String[] args) {
        int[] arr = {23,2,6,4,7};
        System.out.println(checkSubarraySum(arr, 6));
    }




    /// Continuous subarray sum is equals toi target
    public static boolean checkSubarraySum(int[] nums, int k) {
        int  n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            for (int j = i+1; j < n; j++) {
                sum += nums[j];

                if (sum % k == 0){
                    return true;
                } else {
                    continue;
                }

            }
            sum = 0;
        }

        return false;
    }


    // Working solution for bigger arrays\

    public boolean checkSubarraySum2(int[] nums, int k) {
        Set<Integer> modSet=new HashSet();
        int currSum = 0, prevSum=0;
        //when we add prevSum=0 in set it will actually check if currSum is divided by k
        for(int n : nums) {
            currSum += n;
            if(modSet.contains(currSum%k)) {
                return true;
            }
            currSum %=k;
            modSet.add(prevSum);
            prevSum = currSum;
        }
        return false;
    }
}

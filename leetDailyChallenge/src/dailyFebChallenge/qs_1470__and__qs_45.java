package dailyFebChallenge;

public class qs_1470__and__qs_45 {
    public static void main(String[] args) {
//        int[] arr = {2,5,1,3,4,7};
//        System.out.println(Arrays.toString(shuffle(arr, 3)));
        int[] jump = {2, 3, 1, 1, 4};
        System.out.println(jump(jump));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int x = 0;

        for(int i =0; i < nums.length; i+=2){
            ans[i] = nums[x];
            ans[i+1] = nums[x+n];
            x++;
        }
        return ans;
    }

    /// Qs 45
    // https://leetcode.com/problems/jump-game-ii/description/
    public static int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        int curr = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            max = Math.max(max , i + nums[i]);
            if(curr == i){
                curr = max;
                count++;
            }
            if(curr>nums.length-1){
                return count;
            }
        }
        return count;
    }
}

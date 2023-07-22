package Arrays;

public class qs_1752 {

    public static boolean check(int[] nums) {
        int i = 1;
        // for(; i < nums.length; i++) {
        //     if(!(nums[i] == nums[i-1]+1 ||  nums[i] <= nums[i-1]))
        //         break;
        // }

        for(; i < nums.length; i++) {
            if(nums[i] <= nums[i-1])
                break;
        }
        int j = i+1;
        for(; j < nums.length; j++) {
            if(nums[j] <= nums[j-1])
                break;
        }

        if(j == nums.length && nums[j-1] <= nums[i-1]) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4};
        System.out.println(check(arr));
    }

}

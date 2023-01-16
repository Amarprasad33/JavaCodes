package dailyQs;

public class qs_334 {

    public static void main(String[] args) {
        int[] arr = {2,1,5,0,4,6};
        System.out.println(increasingTriplet1(arr));
    }

    public static boolean increasingTriplet(int[] nums) {
        int i = 0;
        int j = nums.length/2;
        int k = nums.length-1;
        boolean var = false;

        while(i < j || j < k){
            if(i < j && j < k){
                if(nums[i] < nums[j] && nums[j] < nums[k]){
                    var = true;
                    return true;
                } else {
                    var = false;
                }
            }
            if(var == false){
                if(i < j){
                    i++;
                } else{
                    k--;
                }
            }
        }

        return false;
    }


    // Little bit optimised from above but sill not good
    public static boolean increasingTriplet1(int[] nums) {
        int i = 0;
        int j = i+1;
        int k = j+1;
        int len  = nums.length;
        boolean var = false;

        while(k <= len -1 ){
            if(i < j && j < k){
                if(nums[i] < nums[j] && nums[j] < nums[k]){
                    var = true;
                    return true;
                } else {
                    var = false;
                }
            }
            i++;
            j++;
            k++;
//            if(var == false){
//                if(i < j){
//                    i++;
//                } else{
//                    k--;
//                }
//            }
        }

        return false;
    }
}

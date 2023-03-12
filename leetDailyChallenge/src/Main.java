import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println("Before sort" + list);
        Collections.sort(list);
        System.out.println("After osrt" + list);

        int[] arr = {-2,-3,0};
        maxScore(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int maxScore(int[] nums) {
        int f = 0, s = nums.length-1;
        while(f < s){
            if(nums[f] > 0) f++;

            if(nums[f] < 0 && nums[s] > 0){
                swap(nums, f, s);
            }

            s--;
        }
        return 0;
    }

    private static void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
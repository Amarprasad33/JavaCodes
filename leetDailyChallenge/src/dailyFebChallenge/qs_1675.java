package dailyFebChallenge;
import java.util.TreeSet;
public class qs_1675 {
    public static void main(String[] args) {
        int[] arr = {4,1,5,20,3};
        System.out.println(minimumDeviation(arr));
    }

    public static int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : nums){
            if (x%2 == 0)
                set.add(x);
            else
                set.add(x*2);
        }
        int ans = Integer.MAX_VALUE;
        while (true) {
            int val = set.last();
            ans = Math.min(ans, val - set.first());
            if (val%2 == 0) {
                set.remove(val);
                set.add(val/2);
            } else
                break;
        }
        return ans;
    }
}

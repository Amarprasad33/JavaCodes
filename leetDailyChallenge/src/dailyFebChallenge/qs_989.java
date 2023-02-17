package dailyFebChallenge;
import java.util.*;
public class qs_989 {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(arr, k));
    }

    // This code breaks on the integer limit
    public static List<Integer> addToArrayForm(int[] num, int k) {
        if(num.length == 1){
            Arrays.asList(num);
        }
        List<Integer> ans = new ArrayList();
        long sum = 0; int exp = 0;
        for(int i = num.length-1; i>= 0; i--){
//            sum += (num[i] == 0) ? num[i]*Math.pow(10, exp++) : Math.pow(10, exp++);
            sum += num[i]*Math.pow(10, exp++);
        }
        sum += k;
        while(sum > 0){
            int temp = (int) (sum%10);
            sum /= 10;
            ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;

    }

    // Using linkedList
    public static List<Integer> addToArrayForm1(int[] num, int k) {
        LinkedList<Integer> res=new LinkedList<>();
        int len=num.length-1;
        while(len>=0 || k>0){
            if(len>=0){
                k+=num[len--];
            }
            res.addFirst(k%10);
            k/=10;
        }
        return res;
    }
}

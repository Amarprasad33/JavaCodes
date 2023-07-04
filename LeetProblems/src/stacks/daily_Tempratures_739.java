package stacks;
import java.util.*;
public class daily_Tempratures_739 {
    public static void main(String[] args) {

    }

    public int[] dailyTemperatures(int[] temperatures) {
        // This solution uses Next Greater to right approach but its runtime is high

        // Stack<int[]> stk = new Stack<>();
        // int n = temperatures.length;
        // int[] NGRgap = new int[n];

        // for(int i = n-1; i>=0; i--){
        //     if(stk.size() == 0)
        //         NGRgap[i] = 0;
        //     else if(stk.size() > 0 && stk.peek()[0] > temperatures[i])
        //         NGRgap[i] = (stk.peek()[1]) - i;
        //     else if(stk.size() > 0 && stk.peek()[0] <= temperatures[i]){
        //         while(stk.size() > 0 && stk.peek()[0] <= temperatures[i]){
        //             stk.pop();
        //         }
        //         if(stk.size() == 0)
        //             NGRgap[i] = 0;
        //         else
        //             NGRgap[i] = stk.peek()[1] - i;
        //     }
        //     stk.push(new int[]{temperatures[i], i});
        // }
        // return NGRgap;

        // A better optimal solution
        Stack<Integer> stk = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()]){
                int pos = stk.pop();
                res[pos] = i-pos;
            }
            stk.push(i);
        }
        return res;
    }
}

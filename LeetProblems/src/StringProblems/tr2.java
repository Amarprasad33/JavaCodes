package StringProblems;

import java.util.Arrays;

public class tr2 {
    public static void main(String[] args) {
       int[] arr = {1, 3, 2, 7, 4, 6};
       int[] ans = Rotate(arr, 3, arr.length, 0);
        System.out.println(Arrays.toString(ans));
    }

    /// left and right rotate array
    static int[] Rotate(int arr[], int p, int n, int d)
    {
        if(n == 0 ){
            return new int[0];
        }
        if(n == 1 ){
            return arr;
        }

        if(d == 0){
            int temp[] = new int[p];
            for (int i = 0; i < p; i++)
                temp[i] = arr[i];
            for (int i = p; i < n; i++) {
                arr[i - p] = arr[i];
            }
            for (int i = 0; i < p; i++) {
                arr[i + n - p] = temp[i];
            }
        }
        if(d == 1){
            while (p > n) {
                p = p - n;
            }
            int temp[] = new int[n - p];
            for (int i = 0; i < n - p; i++)
                temp[i] = arr[i];
            for (int i = n - p; i < n; i++) {
                arr[i - n + p] = arr[i];
            }
            for (int i = 0; i < n - p; i++) {
                arr[i + p] = temp[i];
            }
        }
        return arr;
    }
}

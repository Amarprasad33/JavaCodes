import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));

    }

//    public static int maxScore(int[] cardPoints, int k) {
//        int n = cardPoints.length;
//        if(n < k) return -1;
//        int tot_p = 0, f_win = 0;
//        for(int i = 0; i < n-k; i++)
//            f_win += cardPoints[i];
//
//        for(int i = 0; i < n; i++)
//            tot_p += cardPoints[i];
//
//        System.out.println(f_win);
//        int max = tot_p - f_win;
//        System.out.println(max);
//        for(int i = n-k; i < cardPoints.length; i++){
//            f_win += cardPoints[i] - cardPoints[i - (n-k)];
//            max = Math.max(max, tot_p - f_win);
//        }
//        return max;
//    }

    // #11 Container with most water
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxAr = 0;
        while(l < r){
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh, rh);
            maxAr = Math.max(maxAr, min_h*(r-l));
            if(lh < rh) l++;
            else r--;
        }
        return maxAr;
    }

    public static int trappingRainWater(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];

        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += (Math.min(left[i], right[i]) - height[i]);
        }

        return ans;
    }

}
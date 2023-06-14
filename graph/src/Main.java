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

}
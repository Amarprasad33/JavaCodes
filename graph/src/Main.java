import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1,79,80,1,1,1,200,1};

        System.out.println(maxScore(arr, 3));

    }

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if(n < k) return -1;
        int tot_p = 0, f_win = 0;
        for(int i = 0; i < n-k; i++)
            f_win += cardPoints[i];

        for(int i = 0; i < n; i++)
            tot_p += cardPoints[i];

        System.out.println(f_win);
        int max = tot_p - f_win;
        System.out.println(max);
        for(int i = n-k; i < cardPoints.length; i++){
            f_win += cardPoints[i] - cardPoints[i - (n-k)];
            max = Math.max(max, tot_p - f_win);
        }
        return max;
    }
}
package dailyFebChallenge;

public class qs_121 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1};
        System.out.println(MaxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minIndex = 0, maxIndex = 0;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
                minIndex = i;
            }
            if(prices[i] > maxVal && i > minIndex){
                maxVal =  prices[i];
                maxIndex = i;
            }
        }
        if (maxIndex != 0)
            profit = maxVal - minVal;
        return profit;
    }

    // A better solution:
    public static int MaxProfit(int[] prices){
        int lsf = Integer.MAX_VALUE;
        int profitToday = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < lsf)
                lsf = prices[i];

            profitToday = prices[i] - lsf;
            if(profitToday > maxProfit)
                maxProfit = profitToday;
        }

        return maxProfit;
    }
}

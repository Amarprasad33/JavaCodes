package midQs;

public class qs_122 {
    public static void main(String[] args) {

    }

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

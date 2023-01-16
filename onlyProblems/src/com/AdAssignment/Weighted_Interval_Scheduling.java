package com.AdAssignment;
import java.util.*;

class Job
{
    int start, finish, profit;

    Job(int start, int finish, int profit)
    {
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }
}

public class Weighted_Interval_Scheduling {

    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job( 0, 6, 8 ),
                new Job( 1, 4, 5 ),
                new Job( 3, 5, 3 ),
                new Job( 3, 8, 4 ),
                new Job( 4, 7, 4 ),
                new Job( 5, 9, 7 ),
                new Job( 6, 10,5 ),
                new Job( 8, 11,3 )
                );

        System.out.println("The maximum profit is " + findMaxProfit(jobs));
    }

    public static int findMaxProfit(List<Job> jobs)
    {
        Collections.sort(jobs, Comparator.comparingInt(x -> x.start));
        int n = jobs.size();

        if (n == 0) {
            return 0;
        }

        int[] maxProfit = new int[n];

        // consider calculating every job
        for (int i = 0; i < n; i++)
        {
            maxProfit[i] = 0;
            for (int j = 0; j < i; j++)
            {
                if (jobs.get(j).finish <= jobs.get(i).start
                        && maxProfit[i] < maxProfit[j]) {
                    maxProfit[i] = maxProfit[j];
                }
            }

            maxProfit[i] += jobs.get(i).profit;
        }
        // return the maximum profit
        return Arrays.stream(maxProfit).max().getAsInt();
    }

}

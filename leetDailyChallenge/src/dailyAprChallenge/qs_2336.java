package dailyAprChallenge;
import java.util.*;
import java.util.TreeSet;
public class qs_2336 {




    // Link:  https://leetcode.com/problems/smallest-number-in-infinite-set/
    // Brute force solution

    private PriorityQueue<Integer> pq = null;
    private Set<Integer> set = null;
    public void SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        for(int i = 1; i < 1005; i++){
            pq.add(i);
            set.add(i);
        }
    }

    public int popSmallest() {
        int x = pq.poll();
        set.remove(x);
        return x;
    }

    public void addBack(int num) {
        if(!set.contains(num)){
            pq.add(num);
            set.add(num);
        }
    }

    // A better time optimised solution

    private TreeSet<Integer> set1;
    public void SmallestInfiniteSet1() {
        set1 = new TreeSet<>();
        for(int i = 1; i < 1005; i++){
            set1.add(i);
        }
    }

    public int popSmallest1() {
        return set1.pollFirst();
    }

    public void addBack1(int num) {
        set.add(num);
    }
}

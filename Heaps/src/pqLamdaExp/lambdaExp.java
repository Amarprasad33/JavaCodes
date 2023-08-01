package pqLamdaExp;

import java.util.PriorityQueue;
import java.util.Scanner;

public class lambdaExp {

    public static Scanner sc = new Scanner(System.in);

    public static class pair{
        int v1 = 0, v2 = 0;

        pair(int v1, int v2){
            this.v1 = v1;
            this.v2 = v2;
        }
    }

    public static void test1(){
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
            return a.v1 - b.v2;
        });
        System.out.println("Enter size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Pairs");
            int a = sc.nextInt();
            int b = sc.nextInt();
            pq.add(new pair(a, b));
        }

        while (pq.size() != 0){
            pair p = pq.remove();
            System.out.println(p.v1 + ", " + p.v2);
        }
    }

    public static void main(String[] args) {
        test1();
    }

}

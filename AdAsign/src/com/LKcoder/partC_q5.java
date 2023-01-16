package com.LKcoder;
import java.util.*;

public class partC_q5 {
    static void task(List<Integer> nm, int i, int j)
    {
        if(i == nm.size())
        {
            System.out.println(nm);
            return;
        }
        for(int p = i; p <= j; p++)
        {
            swap(nm, i, p);
            task(nm, i + 1, j);
            swap(nm, i, p);
        }
    }

    static void swap(List<Integer> nm, int i, int j)
    {
        int d = nm.get(i);
        nm.add(i, nm.get(j));
        nm.remove(i + 1);
        nm.add(j, d);
        nm.remove(j + 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> nm = new ArrayList<>();
        int n = sc.nextInt(), i;
        for(i = 0; i < n; i++)
        {
            nm.add(sc.nextInt());
        }
        task(nm, i, n - 1);
    }
}

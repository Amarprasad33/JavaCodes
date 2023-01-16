package com.LKcoder;
import java.util.*;
public class partC_q3 {
    static void task(List<Integer> lst, int i, int k, List<Integer> kk)
    {
        if(i == lst.size())
        {
            if(k ==lst.size())
                System.out.println(lst);
            return;
        }
        kk.add(lst.get(i));
        task(lst, i + 1, k, kk);
        kk.remove(kk.size() - 1);
        task(lst, i + 1, k, kk);
    }

    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        List<Integer> kk = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        task(lst, 0, 3, kk);
    }
}

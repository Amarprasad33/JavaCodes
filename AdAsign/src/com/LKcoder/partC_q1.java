package com.LKcoder;
import java.util.*;
public class partC_q1 {

    static void task(int ls[], int i, List<Integer> lst, int s, int k)
    {
        if(i == ls.length)
        {
            if(s == k)
                System.out.println(lst);
            return;
        }
        lst.add(ls[i]);
        s += ls[i];
        task(ls, i+1, lst, s, k);
        s -= lst.get(lst.size() - 1);
        lst.remove(lst.size() - 1);
        task(ls, i + 1, lst, s, k);
    }

    public static void main(String[] args)
    {
        int a[] = {30, 25, 35, 31, 29};
        int k = 60;
        List<Integer> nm = new ArrayList<>();
        task(a,0, nm, 0, k);
    }

}

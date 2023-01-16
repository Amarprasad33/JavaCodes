package com.LKcoder;
import java.util.*;
public class partC_q2 {

    static void task(List<Integer> lst, int i, int j)
    {
        if(i == lst.size())
        {
            int f;
            for(f = 0; f < lst.size(); f++)
            {
                if(lst.get(f) == f+1)
                    break;
            }
            if(f == lst.size())
                System.out.println(lst);
        }
        for(int p = i; p <= j; p++)
        {
            swap(lst, i, p);
            task(lst, i + 1, j);
            swap(lst, i, p);
        }
    }

    static void swap(List<Integer> lst, int i, int j)
    {
        int d = lst.get(i);
        lst.add(i, lst.get(j));
        lst.remove(i + 1);
        lst.add(j, d);
        lst.remove(j + 1);
    }

    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        task(lst, 0, lst.size() - 1);
    }
}

package com.AVProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArrayRecusively {
    public static void main(String[] args) {
        int[] ar = {2, 0, -4, 8, 7, 3, 23, 1, 5};
        List<Integer> list = new ArrayList<>();
        for(int i: ar) list.add(i);
        sort(list);
        System.out.println(list);
    }

    static void sort(List<Integer> ls){
        if (ls.size() == 1){
            return;
        }

        int temp = ls.get(ls.size() - 1);
        ls.remove(ls.size()-1);
        sort(ls);
        insert(ls, temp);

    }

    static void insert(List<Integer> ls, int ele){
        if(ls.size() == 0 || ls.get(ls.size()-1) <= ele){
            ls.add(ele);
            return;
        }

        int val = ls.get(ls.size() - 1);
        ls.remove(ls.size()-1);
        insert(ls, ele);
        ls.add(val);
    }


}

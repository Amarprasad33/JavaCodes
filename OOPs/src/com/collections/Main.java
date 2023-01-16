package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        list2.add(34);
        list2.add(3);
        list2.add(4);
        list2.add(11);
        list2.add(74);

        System.out.println(list2);

    }
}

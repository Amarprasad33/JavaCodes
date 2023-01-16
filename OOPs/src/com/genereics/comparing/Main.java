package com.genereics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        student kunal = new student(14, 84.96f);
        student rahul = new student(1, 97.25f);
        student arpit = new student(8, 91.75f);
        student sambit = new student(5, 87.24f);
        student sachin = new student(17, 78.38f);

        student[] list = {kunal, rahul, sambit, arpit, sachin};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                return (int) (o1.marks - o2.marks);
//            }
//        });

        // By replacing with lambda function

        Arrays.sort(list, (o1, o2) -> (int) (o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));



//        if (kunal.compareTo(rahul) < 0){
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("Rahul has more marks ");
//        }
    }
}

package com.assignn2_a;
import jdk.jshell.spi.ExecutionControl;

import java.util.*;
public class ques_2 {

    static class student{
        String name;
        int age;
        int mark;

        student(String name, int age, int mark){
            this.name = name;
            this.age = age;
            this.mark = mark;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new  student("kunal", 20,98);
        student s2 = new  student("rahul", 26,74);
        student s3 = new  student("dinesh", 31,86);

        LinkedList<student> students = new LinkedList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (student s : students)
            System.out.println(s.name + " " + s.age + " " + s.mark);

        System.out.print("Enter Student name : ");
        String name = sc.next();
        System.out.print("Enter Student age : ");
        int age = sc.nextInt();
        System.out.print("Enter Student marks : ");
        int marks = sc.nextInt();
        student s4 = new student(name, age, marks);
        boolean b = false;
        for (student s : students){
            if (s.name.equals(s4.name) && s.age == s4.age && s.mark == s4.mark )
                b= true;
        }

        if (b)
            System.out.println("List contains the student");
        else
            System.out.println("List does not contains the student");

        System.out.println("Enter an index position to remove : ");
        int index = sc.nextInt();
        System.out.println("Deleted Student " + index );
        students.remove(index);
        System.out.println("Number of objects in the list : " + students.size());

    }

}

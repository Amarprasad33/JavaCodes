package com.LKcoder;

public class OOOp1 {
    public static void main(String[] args) {
        // Store 5 roll numbers
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student kunal ;
//        kunal = new Student();
        Student kunal = new Student(17, "Kunal kushwaha", 88.69f);
        Student rahul = new Student();
//        kunal.rno = 25;
//        kunal.name = "Kunal Kushwaha ";
//        //kunal.marks = 93.9f;

//        kunal.changeName("SneakerHead");
//        kunal.greeting();


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something" ;
        System.out.println(two.name);


    }

    // Create a class
    // for every single student
    static class Student {
        int rno ;
        String name;
        float marks = 90;

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object
        // In every object. call this keyword os replaced with that object
        // like for example in kunal.greeting() this key word is replaced with kunal

        void greeting(){
            System.out.println("Hello! my name is :" + this.name);
        }

        void changeName(String newName){
            name = newName;
        }

        //in the function call in line 35 it will call this below function
        // in which this(keyword) becomes random and other becomes kunal

        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }


        Student(){
            // This is how you call a constructor from another constructor
            // internally : new Student(13, "Default Person", 100.0f);
            this (13, "Default Person", 100.0f);
        }

        // Student arpit - new Student(17, "Arpit", 89.6f);
        // Here, this will be replaced with arpit
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

}

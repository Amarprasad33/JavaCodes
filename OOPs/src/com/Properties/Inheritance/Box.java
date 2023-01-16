package com.Properties.Inheritance;

public class Box {
   private double l;   // data hiding (encapsulation)
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey, I am in Box class. Greetings!! ");
    }

    public double getL() {
        return l;
    }

    Box(){
        // super(); Object class

        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }


}

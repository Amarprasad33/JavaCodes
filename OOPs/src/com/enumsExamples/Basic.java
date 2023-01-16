package com.enumsExamples;

import com.interfaces.extendDemo2.extendDemo.A;

public class Basic {
    enum Week implements Aus {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can't create child enums
        // type is Week

        Week(){
            System.out.println("Constructor called for " + this.toString());
        }

        @Override
        public void hellu() {
            System.out.println("Hey!! How are you");
        }
        // this is not public or protected , only private or default
        // why? we don't want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hellu();
        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()){
//            System.out.println(day);
//        }

        System.out.println(week.ordinal());

        // ordinal says the position of declaration
    }
}

package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine Car = new car();

       // car.a;
//        Car.acc();
//        Car.start();
//        Car.stop();

//        Media carMedia = new car();
//        carMedia.start();   // Boom car crash!! i want to stop media player :(

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}

package com.yeskova.runners.lesson4;

import com.yeskova.app.classwork.lesson5.Car;

/**
 * Created by Alex on 3/17/17.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.name = "h300";
        Car toyota = new Car();
        toyota.name = "corolla";
        System.out.println(lexus.name + " " + Car.wheelsCounter);
        System.out.println(toyota.name + " " + Car.wheelsCounter);
        Car.wheelsCounter = 5;
        System.out.println(Car.wheelsCounter);
        Car.driver();

        System.out.println(lexus.name + " has" + " " + Car.seats + " seats");
        Car.seats = 7;
        System.out.println(toyota.name + " has" + " " + Car.seats + " seats");

        System.out.println(Car.ENGINE);

    }
}


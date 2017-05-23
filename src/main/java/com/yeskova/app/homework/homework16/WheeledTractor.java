package com.yeskova.app.homework.homework16;

/**
 * Created by Alex on 5/19/17.
 */
public class WheeledTractor extends Tractor {

    public WheeledTractor(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void getSpeed() {
        System.out.println("Min wheeled tractor speed is: " + MIN_SPEED);
    }

    @Override
    public void getMass() {
        System.out.println("Wheeled tractor is heavy");
    }

    @Override
    public void getPassengers() {
        System.out.println("Max wheeled tractor passengers quantity is: " + MAX_PASSENGERS);
    }

    @Override
    public void getWheels() {
        System.out.println("Showing wheeled tractor wheels quantity");
    }

    @Override
    public void printName() {
        super.printName( );
    }

}

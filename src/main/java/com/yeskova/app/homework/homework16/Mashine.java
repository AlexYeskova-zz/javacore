package com.yeskova.app.homework.homework16;

/**
 * Created by Alex on 5/16/17.
 */
public abstract class Mashine implements Run {

    public static final int MAX_SPEED = 300;
    public static final int MIN_SPEED = 10;
    public static final int MIN_PASSENGERS = 1;
    public static final int MAX_PASSENGERS = 14;

    private String name;

    public int speed;

    public Mashine(String name, int speed) {

      this.name = name;
      this.speed = speed;
    }

    @Override
    public void getSpeed() {

    }

    @Override
    public void getMass() {

    }

    @Override
    public void getPassengers() {

    }

    @Override
    public void getWheels() {

    }

    @Override
    public void printName() {
        System.out.println("Mashine name: " + name );
    }


    }





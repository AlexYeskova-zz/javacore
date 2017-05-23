package com.yeskova.app.homework.homework16;

/**
 * Created by Alex on 5/19/17.
 */
public class CrawlerTractor extends Tractor implements Run {


    public CrawlerTractor(String name, int speed) {super(name, speed);}

    public void getSpeed(){System.out.println("Min Crawler tractor speed is: " + MIN_SPEED);}

    public void getMass() {System.out.println("Crawler tractor is heavy");}

    public void getPassengers() {System.out.println("Min crawler tractor passengers quantity is: "
            + MIN_PASSENGERS);}

    public void getWheels() {System.out.println("Showing crawler tractor wheels quantity");}
}

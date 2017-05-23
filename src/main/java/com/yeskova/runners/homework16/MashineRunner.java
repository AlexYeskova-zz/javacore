package com.yeskova.runners.homework16;

import com.yeskova.app.homework.homework16.CrawlerTractor;
import com.yeskova.app.homework.homework16.Tractor;
import com.yeskova.app.homework.homework16.WheeledTractor;

/**
 * Created by Alex on 5/19/17.
 */
public class MashineRunner {

    public static void main(String[] args) {

        String name = "Wheel Tractor";
        int speed = 200;


        WheeledTractor wheeledTractor = new WheeledTractor(name, speed);
        wheeledTractor.printName();
        wheeledTractor.getMass();
        wheeledTractor.getPassengers();
        wheeledTractor.getSpeed();
        wheeledTractor.getWheels();

        System.out.println("_____________________________" );

        String name1 = "Crawler Tractor";
        int speed1 = 300;
        CrawlerTractor crawlerTractor = new CrawlerTractor(name1, speed1);
        crawlerTractor.printName();
        crawlerTractor.getWheels();
        crawlerTractor.getSpeed();
        crawlerTractor.getPassengers();
        crawlerTractor.getMass();





    }
}

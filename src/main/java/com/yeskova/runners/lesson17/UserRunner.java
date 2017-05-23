package com.yeskova.runners.lesson17;

import com.yeskova.app.classwork.lesson17.User;
import sun.rmi.server.UnicastServerRef2;

/**
 * Created by Alex on 5/16/17.
 */
public class UserRunner {

    public static void main(String[] args) {
        User user = new User( );
        user.setAge(10);
        user.setName("KIT");
        user.setPassport("UKR");

        User user2 = new User();
        user2.setAge(10);
        user2.setName("KIT1");
        user2.setPassport("UKR1");

        System.out.println(user.equals(user2) );
    }
}

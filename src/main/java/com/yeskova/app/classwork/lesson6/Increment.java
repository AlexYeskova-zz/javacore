package com.yeskova.app.classwork.lesson6;

/**
 * Created by Alex on 3/24/17.
 */
public class Increment {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Original a value " + a );
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a );
        System.out.println("Pre-increment a " + ++a );
        System.out.println("After pre-increment  " + a);
    }
}

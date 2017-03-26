package com.yeskova.app.classwork.lesson6;

/**
 * Created by Alex on 3/24/17.
 */
public class EvenNumbers {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 21; i++){

            if (i%2==0){

                System.out.print(i + " ");
                counter++;

            }

        }
        System.out.println(counter );
    }
}

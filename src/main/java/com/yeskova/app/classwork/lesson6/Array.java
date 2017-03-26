package com.yeskova.app.classwork.lesson6;

/**
 * Created by Alex on 3/24/17.
 */
public class Array {
    public static void main(String[] args) {
        int[] arrayInt = new int[2];
     arrayInt[0] = 5;
     arrayInt[1] = 10;

        System.out.println(arrayInt);
        for(int arrayPosition: arrayInt) {
            System.out.println(arrayPosition);
        }
    boolean [] arrayBool = new boolean [5];
        arrayBool[0]= false;
        arrayBool[1]= false;
        arrayBool[2]= false;
        arrayBool[3]= true;
        arrayBool[4]= false;

        System.out.println(arrayBool);
        for(boolean arrayPosition: arrayBool) {
            System.out.println(arrayPosition);
        }
        System.out.println(arrayBool.length);
        System.out.println(arrayBool[1]);


    }

}

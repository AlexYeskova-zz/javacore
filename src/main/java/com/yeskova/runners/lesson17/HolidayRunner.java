package com.yeskova.runners.lesson17;

import com.yeskova.app.classwork.lesson17.Holidays;

/**
 * Created by Alex on 5/16/17.
 */
public class HolidayRunner {
    public static void main(String[] args) {

        for(Holidays cData : Holidays.values()) {
            System.out.println(" Today is " + cData.getDay() +
                    " of "+ cData.getMonth() + " .So " +
                    cData.getCongratulations()
            + "!");
        }
    }
}

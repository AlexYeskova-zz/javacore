package com.yeskova.app.classwork.lesson5;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Alex on 3/21/17.
 */
public class TestTest {

    @Ignore("Not ready yet")
    @Test(timeout = 1000)
    public void thisTestNotready(){}


    @Test(timeout = 1000) //interrupt after 1000 milliseconds
    public void infinityTest(){
        while (true);
    }
}


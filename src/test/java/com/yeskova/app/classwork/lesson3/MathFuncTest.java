package com.yeskova.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Alex on 15.03.17.
 */
public class MathFuncTest {

    @Test //JUnit framework annotation
    public void multiplyTest(){
        int a = 1;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void substracktionTest(){
        int a = 3;
        int b = 1;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.subtracktion(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }


}

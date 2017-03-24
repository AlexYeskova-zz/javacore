package com.yeskova.app.homework.homework5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Alex on 3/22/17.
 */


@RunWith(JUnitParamsRunner.class)

public class DataProviderEasyPhysTest {
    @Test
    public void weightTest(){
        int a = 1;
        int b = 2;
        EasyPhys easyPhys = new EasyPhys();
        int actualResult = easyPhys.weight(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test

    @FileParameters( value = "src/test/resources/homework5.csv",
            mapper = CsvWithHeaderMapper.class)

    public void DataProviderForSasha(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, EasyPhys.momentum(argA, argB));
    }
/*
    @Test
    @Ignore
    @FileParameters( value = "src/test/resources/homework5-1.csv",
            mapper = CsvWithHeaderMapper.class)

    public void DataProviderForAlex(float argA, float argB, float expOut) {
        Assert.assertEquals(expOut, EasyPhys.weight(argA, argB));
    }*/

    @Test
    @FileParameters( value = "src/test/resources/homework5-2.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderForSasha2(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, EasyPhys.pressure(argA, argB));
    }


    @Test
    @FileParameters( value = "src/test/resources/homework5-3.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderForSasha3(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, EasyPhys.weight(argA, argB));
    }

}

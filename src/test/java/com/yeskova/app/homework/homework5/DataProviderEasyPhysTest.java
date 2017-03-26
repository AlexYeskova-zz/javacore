package com.yeskova.app.homework.homework5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.sun.tools.doclint.Entity.delta;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test

    @FileParameters( value = "src/test/resources/homework5-1.csv",
            mapper = CsvWithHeaderMapper.class)

    public void DataProviderForAlex(float argA, float argB, float expOut) {
        Assert.assertEquals(expOut, EasyPhys.weight1(argA,argB),0);
    }

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

    @Test
    @FileParameters( value = "src/test/resources/homework5-4.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderForSasha4(float argA, float argB, float expOut) {
        Assert.assertNotEquals(expOut, EasyPhys.weight1(argA,argB));
    }

    @Test
    @FileParameters( value = "src/test/resources/homework5-5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderNotEquals(int argA, int argB, int expOut) {
        Assert.assertNotEquals(expOut, EasyPhys.momentum(argA,argB));
    }

    @Test
    @FileParameters( value = "src/test/resources/homework5-6.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProvider(int argA, int argB){
        Assert.assertNotNull("Array is not empty", EasyPhys.momentum(argA,argB));
    }

    @Test
    @FileParameters( value = "src/test/resources/homework5-2.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderBeginAgain(int argA, int argB, int expOut){
        Assert.assertSame("Hello darkness my old friend...", expOut, EasyPhys.pressure(argA, argB));
    }

    @Test
    @FileParameters( value = "src/test/resources/homework5-5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderNadoel(int argA, int argB, int expOut) {
        Assert.assertNotSame(expOut, EasyPhys.weight(argA, argB));
    }

    @Test
    @FileParameters( value = "src/test/resources/homework5-5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void DataProviderLast(int argA, int argB, int expOut) {
        Assert.assertNotSame("Privet Poka",expOut, EasyPhys.weight(argA, argB));
    }

}

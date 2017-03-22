package com.yeskova.app.classwork.lesson5;

import com.yeskova.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Alex on 3/22/17.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFuncTest {


    @Test

    @FileParameters(value = "src/test/resources/testdata.csv",

            mapper = CsvWithHeaderMapper.class)

    public void dataProviderTestAdd(int argA, int argB, int expOut) {

        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));

    }

}


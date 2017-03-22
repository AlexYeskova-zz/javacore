package com.yeskova.app.homework.homework5;

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

public class DataProviderMathCalcTest {

    @Test

    @FileParameters( value = "src/test/resources/homework5.csv",
            mapper = CsvWithHeaderMapper.class)

    public void DataProviderForSasha(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, EasyPhys.momentum(argA, argB));
    }



}

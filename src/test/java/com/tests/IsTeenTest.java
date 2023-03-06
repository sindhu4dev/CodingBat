package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IsTeenTest {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value = {"13,20,10,true","20,19,10,true"})
    public void isTeenNumber(int input1, int input2, int input3, boolean expected){
        boolean actual = sut.isTeen(input1,input2,input3);
        Assert.assertEquals(expected, actual);
    }

}

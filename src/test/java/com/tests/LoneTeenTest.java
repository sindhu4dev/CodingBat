package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LoneTeenTest {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value = {"13,99,true", "21,19,true"})
    public void isLoneTeen(int input1, int input2, boolean expected){
        boolean actual = sut.loneTeen(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}

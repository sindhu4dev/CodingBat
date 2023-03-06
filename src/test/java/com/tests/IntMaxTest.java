package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntMaxTest {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value = {"1,2,3,3", "2,3,4,4"})
    public void testIfTheGivenIntegerIsMax(int input1, int input2, int input3, int expected){
        int actual = sut.intMax(input1, input2, input3);
        Assert.assertEquals(expected, actual);
    }
}

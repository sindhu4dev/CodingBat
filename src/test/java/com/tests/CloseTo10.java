package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CloseTo10 {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value = {"8,13,8", "13,8,8", "13,7,0"})
    public void testIfTheGivenNumberIsCloseTo10(int input1, int input2, int expected){
        int actual = sut.close10(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}

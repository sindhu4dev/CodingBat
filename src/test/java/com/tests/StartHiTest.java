package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StartHiTest {
    private CodingBat sut = new CodingBat();

    @ParameterizedTest
    @CsvSource(value = {"Hip,true", "Hiooo,true", "Hoo,false"})
    public void checkWhetherTheGivenWordStartsWithHi(String input, boolean expected) {
        boolean actual = sut.startHi(input);
        Assert.assertEquals(expected, actual);
    }
}

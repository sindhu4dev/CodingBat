package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BackAroundTest {

    CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value ={"cat:tcatt", "Hello:oHelloo", "abc:cabcc"}, delimiter = ':')
    public void test(String input, String expected){

        String actual = sut.backAround(input);
        Assert.assertEquals(expected, actual);
    }


}

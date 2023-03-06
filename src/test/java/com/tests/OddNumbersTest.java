package com.tests;

import org.example.OddNumbers;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class OddNumbersTest {
    private OddNumbers sut = new OddNumbers();
    @ParameterizedTest
    @ValueSource(ints = {2,4,6})
    public void testTheGivenNumbersAreReturnFalseOddNumbers(int number) {
        Assert.assertFalse(sut.isOddNumber(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {5,7,9})
    public void testTheGivenNumbersAreReturnTrueOddNumbers(int number) {
        Assert.assertTrue(sut.isOddNumber(number));
    }
}


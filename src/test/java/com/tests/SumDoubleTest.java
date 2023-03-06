package com.tests;

import org.example.SumDouble;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SumDoubleTest {
    private SumDouble sut = new SumDouble();
   /* @Test
    public void testSumDoubleReturnsSumOfInputsWhenTheyAreNotEqual(){
        Assert.assertEquals(3, sut.sumDouble(1, 2));
    }
    @Test
    public void testSumDoubleReturnsTwiceTheSumOfInputsWhenTheyAreEqual(){
        Assert.assertEquals(0, sut.sumDouble(0, 0));
        Assert.assertEquals(4, sut.sumDouble(1, 1));
    }*/
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        Assert.assertTrue(number<10);
    }
    @ParameterizedTest
    @CsvSource(value = {"test:test", "RAMA:rama", "Java:java"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actualValue = input.toLowerCase();
        Assert.assertEquals(expected, actualValue);
    }
}

package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FrontBackTest {
    private CodingBat sut = new CodingBat();
 @ParameterizedTest
 @CsvSource(value = {"code:eodc","a:a", "ab:ba", "ritu:uitr"},delimiter = ':')
    public void test(String input, String expected){
    String output = sut.frontBack(input);
     Assert.assertEquals(expected, output);
     }
    }


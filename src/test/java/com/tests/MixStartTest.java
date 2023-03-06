package com.tests;

import com.sun.jdi.Value;
import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MixStartTest {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value = {"mix snacks, true", "pix snacks, true", "piz snacks, false"})
    public void checkIfTheWordStartsWithIx(String input, boolean expected){
        boolean actual = sut.mixStart(input);
        Assert.assertEquals(expected, actual);
    }
}

package com.tests;

import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StartOZ {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource(value = {"ozymandias, oz", "bzoo, z", "oxx, o"})
    public void checkIfTheLetterOAndZAppearsAtBeginning(String input, String expected){
        String actual = sut.startOz(input);
        Assert.assertEquals(expected, actual);
    }
}

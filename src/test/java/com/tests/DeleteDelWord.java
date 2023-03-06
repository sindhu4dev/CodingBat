package com.tests;

import com.sun.jdi.Value;
import org.example.CodingBat;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DeleteDelWord {
    private CodingBat sut = new CodingBat();
    @ParameterizedTest
    @CsvSource ( value = {"adelbc,abc","adelHello,aHello","adedbc,adedbc" })
    public void deleteTheWordDel(String input, String expected){
        String actual = sut.delDel(input);
        Assert.assertEquals(expected, actual);
        //test git

    }
}

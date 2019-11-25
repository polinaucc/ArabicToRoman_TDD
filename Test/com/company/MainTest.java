package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    ArabicToRomanConvertor convertor;

    @Before
    public void before() {
        convertor = new ArabicToRomanConvertor();
    }

    @Test
    public void Convert_0_to_EmptyStr(){
        String romanNumber = convertor.convert(0);
        Assert.assertTrue(romanNumber=="");
    }

}
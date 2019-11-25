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

    private String convert(int arabicNumber){
        return convertor.convert(arabicNumber);
    }

    @Test
    public void Convert_0_to_EmptyStr(){
        Assert.assertEquals(convert(0),"");
    }

    @Test
    public void Convert_1_to_I(){
        Assert.assertEquals(convert(1),"I");
    }

    @Test
    public void Convert_2_to_II(){
        Assert.assertEquals(convert(2),"II");
    }
}
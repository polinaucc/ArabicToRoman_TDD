package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    public ArabicToRomanConvertor convertor;

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
    public void Convert_Neg_to_EmptyStr(){
        Assert.assertEquals(convert(-1),"");
    }

    @Test
    public void Convert_1_to_I(){
        Assert.assertEquals(convert(1),"I");
    }

    @Test
    public void Convert_2_to_II(){
        Assert.assertEquals(convert(2),"II");
    }

    @Test
    public void Convert_4_to_IV(){
        Assert.assertEquals(convert(4),"IV");
    }

    @Test
    public void Convert_5_to_V(){
        Assert.assertEquals(convert(5),"V");
    }

    @Test
    public void Convert_10_to_X(){
        Assert.assertEquals(convert(10),"X");
    }

    @Test
    public void Convert_9_to_IX(){
        Assert.assertEquals(convert(9),"IX");
    }
}
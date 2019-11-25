package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanConvertor {
    private LinkedHashMap<Integer, String> digits;

    public ArabicToRomanConvertor() {
        this.digits = new LinkedHashMap<>();
        digits.put(1000, "M");
        digits.put(900, "CM");
        digits.put(500, "D");
        digits.put(400, "CD");
        digits.put(100, "C");
        digits.put(90, "XC");
        digits.put(50, "L");
        digits.put(40, "XL");
        digits.put(10, "X");
        digits.put(9, "IX");
        digits.put(5, "V");
        digits.put(4, "IV");
        digits.put(1, "I");
    }

    public String convert (int arabicNumber){
        String romanNumber = "";
        for(Map.Entry<Integer, String> d: digits.entrySet()){
            while (arabicNumber>=d.getKey() && arabicNumber<4000){
                romanNumber += d.getValue();
                arabicNumber-=d.getKey();
            }
        }
        return romanNumber;
    }
}

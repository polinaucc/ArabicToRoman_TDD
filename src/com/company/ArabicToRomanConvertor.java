package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanConvertor {
    private LinkedHashMap<Integer, String> digits;

    public ArabicToRomanConvertor() {
        this.digits = new LinkedHashMap<>();
        digits.put(5, "V");
        digits.put(4, "IV");
        digits.put(1, "I");
    }

    public String convert (int arabicNumber){
        String romanNumber = "";
        for(Map.Entry<Integer, String> d: digits.entrySet()){
            while (arabicNumber>=d.getKey()){
                romanNumber += d.getValue();
                arabicNumber-=d.getKey();
            }
        }
        return romanNumber;
    }
}

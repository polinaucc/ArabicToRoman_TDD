package com.company;

public class ArabicToRomanConvertor {
    public String convert (int arabicNumber){
        String romanNumber = "";
        while(arabicNumber>=1){
            romanNumber += "I";
            arabicNumber--;
        }
        return romanNumber;
    }
}

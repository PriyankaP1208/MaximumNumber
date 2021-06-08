package com.bridgelabz;

public class MaximumNumber {
    public static Integer compareIntegerValues(Integer num1, Integer num2, Integer num3){
        Integer maxNumber = num1;
        if(num2.compareTo(maxNumber) > 0)
        {
            maxNumber = num2;
        }
        if(num3.compareTo(maxNumber) > 0)
        {
            maxNumber = num3;
        }
        return maxNumber;
    }

    public static Float compareFloatValues(Float num1, Float num2, Float num3){
        Float maxNumber = num1;
        if(num2.compareTo(maxNumber) > 0)
        {
            maxNumber = num2;
        }
        if(num3.compareTo(maxNumber) > 0)
        {
            maxNumber = num3;
        }
        return maxNumber;
    }

    public static String compareStringValues(String s1, String s2, String s3){
        String maxString = s1;
        if(s2.compareTo(maxString) > 0)
        {
            maxString = s2;
        }
        if(s3.compareTo(maxString) > 0)
        {
            maxString = s3;
        }
        return maxString;
    }
}

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
}

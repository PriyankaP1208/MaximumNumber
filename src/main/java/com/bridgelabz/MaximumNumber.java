package com.bridgelabz;

public class MaximumNumber {
    public static <T extends Comparable<T>> T max(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}

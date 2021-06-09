package com.bridgelabz;

public class MaximumNumber <T extends Comparable<T>> {
    T[] values;

    public static <T> void printMaximum(T maximum){
        System.out.println("Maximum:" + maximum);
    }

    @SafeVarargs
    public MaximumNumber(T... values){
        this.values = values;
    }

    public static <T extends Comparable<T>> T max(T... values) {
        T maximum = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if(maximum.compareTo(values[i]) < 0) {
                maximum = values[i];
            }
        }
        return maximum;
    }

    public T maximumValue() {
       T maximum = max(values);
       printMaximum(maximum);
       return maximum;
    }
}

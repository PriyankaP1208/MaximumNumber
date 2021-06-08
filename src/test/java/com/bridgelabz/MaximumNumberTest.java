package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class MaximumNumberTest {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void givenIntegerNumbers_WhenFirstNumberIsMaximum_ShouldReturnMaximum() {
        Integer maximum = MaximumNumber.compareIntegerValues(40, 20, 10);
        Assert.assertEquals((Integer) 40, maximum);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ShouldReturnMaximum() {
        Integer maximum = MaximumNumber.compareIntegerValues(40, 60, 10);
        Assert.assertEquals((Integer) 60, maximum);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ShouldReturnMaximum() {
        Integer maximum = MaximumNumber.compareIntegerValues(40, 60, 100);
        Assert.assertEquals((Integer) 100, maximum);
    }

    @Test
    public void givenFloatNumbers_WhenFirstNumberIsMaximum_ShouldReturnMaximum() {
        Float maximum = MaximumNumber.compareFloatValues(10.1f, 5.2f, 2.1f);
        Assert.assertEquals((Float) 10.1f, maximum);
    }

    @Test
    public void givenFloatNumbers_WhenSecondNumberIsMaximum_ShouldReturnMaximum() {
        Float maximum = MaximumNumber.compareFloatValues(10.1f, 15.2f, 2.1f);
        Assert.assertEquals((Float) 15.2f, maximum);
    }

    @Test
    public void givenFloatNumbers_WhenThirdNumberIsMaximum_ShouldReturnMaximum() {
        Float maximum = MaximumNumber.compareFloatValues(10.1f, 15.2f, 20.1f);
        Assert.assertEquals((Float) 20.1f, maximum);
    }

    @Test
    public void givenStrings_WhenFirstStringIsMaximum_ShouldReturnMaximum() {
        String maximum = MaximumNumber.compareStringValues("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenStrings_WhenSecondStringIsMaximum_ShouldReturnMaximum() {
        String maximum = MaximumNumber.compareStringValues("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenStrings_WhenThirdStringIsMaximum_ShouldReturnMaximum() {
        String maximum = MaximumNumber.compareStringValues("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximum);
    }
}

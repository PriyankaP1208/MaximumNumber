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
}

package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class MaximumNumberTest {

    @Test
    public void givenIntegerNumbers_WhenFirstNumberIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(40, 20, 10, 5);
        Integer max = maximumNumber.maximumValue();
        Assert.assertEquals((Integer) 40, max);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(40, 60, 10);
        Integer max = maximumNumber.maximumValue();
        Assert.assertEquals((Integer) 60, max);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(40, 60, 100);
        Integer max = maximumNumber.maximumValue();
        Assert.assertEquals((Integer) 100, max);
    }

    @Test
    public void givenFloatNumbers_WhenFirstNumberIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>(10.1f, 5.2f, 2.1f, 1.1f);
        Float max = maximumNumber.maximumValue();
        Assert.assertEquals((Float) 10.1f, max);
    }

    @Test
    public void givenFloatNumbers_WhenSecondNumberIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>(10.1f, 15.2f, 2.1f);
        Float max = maximumNumber.maximumValue();
        Assert.assertEquals((Float) 15.2f, max);
    }

    @Test
    public void givenFloatNumbers_WhenThirdNumberIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>(10.1f, 15.2f, 20.1f);
        Float max = maximumNumber.maximumValue();
        Assert.assertEquals((Float) 20.1f, max);
    }

    @Test
    public void givenStrings_WhenFirstStringIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>("Peach", "Apple", "Banana", "Orange");
        String max = maximumNumber.maximumValue();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenStrings_WhenSecondStringIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>("Apple", "Peach", "Banana");
        String max = maximumNumber.maximumValue();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenStrings_WhenThirdStringIsMaximum_ShouldReturnMaximum() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>("Apple", "Banana", "Peach");
        String max = maximumNumber.maximumValue();
        Assert.assertEquals("Peach", max);
    }
}

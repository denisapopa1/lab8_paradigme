package org.example;

import org.example.DoubleCalculator;
import org.junit.jupiter.api.*;

public class DoubleCalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(0.0);
        double value = 5.0;

        // Act
        calculator.add(value);

        // Assert
        Assertions.assertEquals(5.0, calculator.getState().intValue());
    }

    @Test
    public void testSubtract() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(10.0);
        double value = 3.0;

        // Act
        calculator.subtract(value);

        // Assert
        Assertions.assertEquals(7.0, calculator.getState().intValue());
    }

    @Test
    public void testMultiply() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(2.0);
        double value = 3.0;

        // Act
        calculator.multiply(value);

        // Assert
        Assertions.assertEquals(6.0, calculator.getState().intValue());
    }


}

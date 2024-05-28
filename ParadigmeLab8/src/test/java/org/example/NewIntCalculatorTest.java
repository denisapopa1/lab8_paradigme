package org.example;
import org.example.NewIntCalculator;
import org.junit.jupiter.api.*;

public class NewIntCalculatorTest{
    @Test
    public void testAdd() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(0);
        int value = 5;

        // Act
        calculator.add(value);

        // Assert
        Assertions.assertEquals(5, calculator.getState().intValue());
    }

    @Test
    public void testSubtract() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);
        int value = 3;

        // Act
        calculator.subtract(value);

        // Assert
        Assertions.assertEquals(7, calculator.getState().intValue());
    }

    @Test
    public void testMultiply() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(2);
        int value = 3;

        // Act
        calculator.multiply(value);

        // Assert
        Assertions.assertEquals(6, calculator.getState().intValue());
    }



}

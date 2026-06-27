package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator Calculator;

    @BeforeEach
    public void setUp() {
        Calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        double result = Calculator.multiply(2.5 ,3.3, 4.2);
        assertEquals(34.65, result, "2.5 * 3.5 * 4.2 should be 34.65");
    }

    @Test
    public void testDivide() {
        double result = Calculator.divide(8, 2);
        assertEquals(4, result, "8 / 2 should be 4");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10.5, 0);
        });
    }

}

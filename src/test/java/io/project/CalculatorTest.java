package io.project;


import io.project.task4.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        calculator.setOperation(new Addition());
        assertEquals(15.0, calculator.calculate(10, 5));
    }

    @Test
    public void testSubtraction() {
        calculator.setOperation(new Subtraction());
        assertEquals(5.0, calculator.calculate(10, 5));
    }

    @Test
    public void testMultiplication() {
        calculator.setOperation(new Multiplication());
        assertEquals(50.0, calculator.calculate(10, 5));
    }

    @Test
    public void testDivision() {
        calculator.setOperation(new Division());
        assertEquals(2.0, calculator.calculate(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        calculator.setOperation(new Division());
        assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(10, 0);
        }, "Division by zero should throw ArithmeticException");
    }
}
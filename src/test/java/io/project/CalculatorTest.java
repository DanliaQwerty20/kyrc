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
        calculator.setNumber1(10);
        calculator.setNumber2(5);
        calculator.setOperation(new Addition());
        calculator.calculate();
        assertEquals(15.0, calculator.getResult());
    }

    @Test
    public void testSubtraction() {
        calculator.setNumber1(10);
        calculator.setNumber2(5);
        calculator.setOperation(new Subtraction());
        calculator.calculate();
        assertEquals(5.0, calculator.getResult());
    }

    @Test
    public void testMultiplication() {
        calculator.setNumber1(10);
        calculator.setNumber2(5);
        calculator.setOperation(new Multiplication());
        calculator.calculate();
        assertEquals(50.0, calculator.getResult());
    }

    @Test
    public void testDivision() {
        calculator.setNumber1(10);
        calculator.setNumber2(5);
        calculator.setOperation(new Division());
        calculator.calculate();
        assertEquals(2.0, calculator.getResult());
    }

    @Test
    public void testDivisionByZero() {
        calculator.setNumber1(10);
        calculator.setNumber2(0);
        calculator.setOperation(new Division());
        assertThrows(ArithmeticException.class, () -> {
            calculator.calculate();
        }, "Division by zero should throw ArithmeticException");
    }
}
package io.project.task4;

import io.project.task4.exception.DivisionByZeroException;

public class Division implements Operation {
    @Override
    public double execute(double number1, double number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль невозможно.");
        }
        return number1 / number2;
    }
}
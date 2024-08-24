package io.project.task4;

import io.project.task4.exception.DivisionByZeroException;

public class Calculator {
    private double number1;
    private double number2;
    private double result;
    private Operation operation;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }


    public void calculate() {
        try {
            result = operation.execute(number1, number2);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            result = Double.NaN;
        }
    }
}
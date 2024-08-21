package io.project.task4;

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
        if (operation != null) {
            result = operation.execute(number1, number2);
        } else {
            throw new IllegalStateException("Операция не задана");
        }
    }
}
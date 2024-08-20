package io.project.task4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Пример использования калькулятора
        calculator.setOperation(new Addition());
        System.out.println("Сложение: " + calculator.calculate(10, 5));

        calculator.setOperation(new Subtraction());
        System.out.println("Вычитание: " + calculator.calculate(10, 5));

        calculator.setOperation(new Multiplication());
        System.out.println("Умножение: " + calculator.calculate(10, 5));

        calculator.setOperation(new Division());
        System.out.println("Деление: " + calculator.calculate(10, 5));
    }
}
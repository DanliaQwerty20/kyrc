package io.project.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextDouble());
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextDouble());

            calculator.setOperation(new Addition());
            calculator.calculate();
            System.out.println("Сложение: " + calculator.getResult());

            calculator.setOperation(new Subtraction());
            calculator.calculate();
            System.out.println("Вычитание: " + calculator.getResult());

            calculator.setOperation(new Multiplication());
            calculator.calculate();
            System.out.println("Умножение: " + calculator.getResult());

            calculator.setOperation(new Division());
            calculator.calculate();
            System.out.println("Деление: " + calculator.getResult());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: пожалуйста, введите число.");
        }
    }
}


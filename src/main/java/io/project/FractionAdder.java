package io.project;

/**
 * Hello world!
 *
 */


import java.util.Scanner;


public class FractionAdder {

    /**
     * Метод для выполнения сложения двух дробных чисел.
     *
     * @param num1 первое дробное число
     * @param num2 второе дробное число
     * @return результат сложения двух дробных чисел, округленный до четырех знаков после запятой
     */
    public static double addFractions(double num1, double num2) {
        return Math.round((num1 + num2) * 10000.0) / 10000.0;
    }

    /**
     * Метод для выполнения вычитания двух дробных чисел.
     *
     * @param num1 первое дробное число
     * @param num2 второе дробное число
     * @return результат вычитания двух дробных чисел, округленный до четырех знаков после запятой
     */
    public static double subtractFractions(double num1, double num2) {
        return Math.round((num1 - num2) * 10000.0) / 10000.0;
    }

    /**
     * Метод для выполнения умножения двух дробных чисел.
     *
     * @param num1 первое дробное число
     * @param num2 второе дробное число
     * @return результат умножения двух дробных чисел, округленный до четырех знаков после запятой
     */
    public static double multiplyFractions(double num1, double num2) {
        return Math.round((num1 * num2) * 10000.0) / 10000.0;
    }

    /**
     * Метод для выполнения деления двух дробных чисел.
     *
     * @param num1 первое дробное число
     * @param num2 второе дробное число
     * @return результат деления двух дробных чисел, округленный до четырех знаков после запятой
     */
    public static double divideFractions(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return Math.round((num1 / num2) * 10000.0) / 10000.0;
    }

    /**
     * Метод для поиска самого длинного слова в массиве.
     *
     * @param words массив слов
     * @return самое длинное слово в массиве
     */
    public static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int task = scanner.nextInt();
        scanner.nextLine(); // Считываем оставшийся символ новой строки

        if (task == 1) {
            System.out.println("Введите первое дробное число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе дробное число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию: (1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление)");
            int operation = scanner.nextInt();

            double result = 0;
            switch (operation) {
                case 1:
                    result = addFractions(num1, num2);
                    break;
                case 2:
                    result = subtractFractions(num1, num2);
                    break;
                case 3:
                    result = multiplyFractions(num1, num2);
                    break;
                case 4:
                    result = divideFractions(num1, num2);
                    break;
                default:
                    System.out.println("Неверная операция");
                    return;
            }

            System.out.printf("Результат: %.4f%n", result);
        } else if (task == 2) {
            System.out.println("Введите размерность массива: ");
            int size = scanner.nextInt();
            scanner.nextLine(); // Считываем оставшийся символ новой строки

            String[] words = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Введите слово " + (i + 1) + ": ");
                words[i] = scanner.nextLine();
            }

            String longestWord = findLongestWord(words);
            System.out.println("Самое длинное слово: " + longestWord);
        } else {
            System.out.println("Неверный номер задания");
        }

        scanner.close();
    }
}


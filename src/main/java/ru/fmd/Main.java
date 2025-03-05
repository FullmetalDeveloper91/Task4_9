package ru.fmd;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Введите число a");
        a = scanner.nextDouble();

        System.out.println("Введите число b");
        b = scanner.nextDouble();

        Calculator calculator = new Calculator(new Adder());
        System.out.printf("Результат сложения a и b: %.1f\n",calculator.calc(a,b));

        calculator.setOperation(new Subtractor());
        System.out.printf("Результат вычитания a и b: %.1f\n",calculator.calc(a,b));

        calculator.setOperation(new Multiplier());
        System.out.printf("Результат умножения a и b: %.1f\n",calculator.calc(a,b));

        calculator.setOperation(new Divider());
        System.out.printf("Результат деления a и b: %.1f\n", calculator.calc(a, b));
    }
}
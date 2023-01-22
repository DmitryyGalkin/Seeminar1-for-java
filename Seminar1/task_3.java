package Seminar1;
/* Задание 3.
Реализовать простой калькулятор (операции + - / * ) */

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double res;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();
        System.out.print("Введите операцию( + - / * ): ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            default:
                System.out.printf("Введите корректный оператор!");
                return;
        }
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + res);
        scanner.close();
    }
}
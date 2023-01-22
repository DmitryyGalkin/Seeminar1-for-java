/* Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n */

package Seminar1;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        int sumDigit = 0;
        int factDigit = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int digit = scanner.nextInt();
        for (int i = 1; i <= digit; i++) {
            sumDigit += i;
        }
        for (int j = 1; j <= digit; j++) {
            if (digit == 0) {
                factDigit = 1;
            }
            factDigit *= j;
        }
        System.out.printf("Cумма чисел от 1 до %d равна %d, Факториал числа %d равен %d",
                digit, sumDigit, digit, factDigit);
        scanner.close();
    }
}

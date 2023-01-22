/* Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n */

package Seminar1;

import java.util.Scanner;

 public class task_1 {
    public static void main(String[] args) {
        int sumDigit=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int digit = scanner.nextInt();
        for (int i = 1; i <= digit; i++) {
            sumDigit += i;
        }
        System.out.println( sumDigit);
        scanner.close();
    }
}

package org.example.Homework_2.hw_1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        System.out.println("Сумма простых чисел в последовательности из " + number + " элементов = " + simpleNumSum(number));
    }

    /**
     * Подсчет суммы простых чисел в последовательности
     *
     * @param sequenceAmount - количество элементов последовательности
     * @return - Сумма простых чисел в последовательности
     */
    public static int simpleNumSum(int sequenceAmount) {
        Scanner scanner2 = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < sequenceAmount; i++) {
            int currentNum = scanner2.nextInt();
            if (isSimple(currentNum)) {
                counter += currentNum;
            }
        }
        return counter;
    }

    /**
     * Алгоритм проверки числа на простоту
     *
     * @param number - число, проверяемое на простоту
     * @return - true = число простое, false = число составное
     */
    public static boolean isSimple(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

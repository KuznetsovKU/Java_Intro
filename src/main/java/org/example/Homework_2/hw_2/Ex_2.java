package org.example.Homework_2.hw_2;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        System.out.println("Результат проверки последовательности на возрастание: " + isRising(number));
    }

    /**
     * @param sequenceAmount - количество элементов в последовательности
     * @return - результат проверки на возрастание: true = последовательность возрастающая
     */
    public static boolean isRising(int sequenceAmount) {
        Scanner scanner2 = new Scanner(System.in);
        int lastNum = MIN_VALUE;
        for (int i = 0; i < sequenceAmount; i++) {
            int currentNum = scanner2.nextInt();
            if (currentNum < lastNum) {
                return false;
            }
            lastNum = currentNum;
        }
        return true;
    }
}

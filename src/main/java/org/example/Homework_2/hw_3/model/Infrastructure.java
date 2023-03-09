package org.example.Homework_2.hw_3.model;

import java.util.Random;

public class Infrastructure {
    /**
     * Метод заполнения одномерного массива псевдо-случайными числами
     *
     * @param size - размер выходного массива
     * @param min  - минимальное значение для случайного заполнения
     * @param max  - максимальное значение для случайного заполнения
     * @return - массив, заполненный псевдо-случайными числами
     */
    public static int[] fillArray(int size, int min, int max) {
        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(min, max + 1);
        }
        return result;
    }


    /**
     * Метод, заменяющий отрицательные элементы массива на сумму индексов двузначных элементов массива.
     *
     * @param inputArr - массив, в котором нужно произвести замены
     */
    public static void solution(int[] inputArr) {
        int Counter = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (isTwoDigits(inputArr[i])) {
                Counter += i;
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < 0) {
                inputArr[i] = Counter;
            }
        }
    }

    /**
     * Проверка передаваемого числа на двузначность
     *
     * @param number - число, передаваемое для проверки
     * @return - результат проверки числа на двузначность: true = число двузначное
     */
    public static boolean isTwoDigits(int number) {
        return Math.abs(number) >= 10 && Math.abs(number) <= 99;
    }

    /**
     * Проверка передаваемого числа на количество разрядов
     *
     * @param number - число, передаваемое для проверки
     * @param grade  - количество разрядов, соответствие которому нужно проверить
     * @return - результат проверки: true = число number имеет количество разрядов, равное grade
     */
    public static boolean isAnyDigits(int number, int grade) {
        String numStr = Integer.toString(Math.abs(number));
        return numStr.length() == grade;
    }

    /**
     * Метод, заменяющий отрицательные элементы массива на сумму индексов элементов массива, соответствующих заявленной разрядности.
     *
     * @param inputArr - массив, в котором нужно произвести замены
     * @param grade    - искомое количество разрядов
     */
    public static void solution2(int[] inputArr, int grade) {
        int Counter = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (isAnyDigits(inputArr[i], grade)) {
                Counter += i;
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < 0) {
                inputArr[i] = Counter;
            }
        }
    }

    /**
     * Метод, заменяющий отрицательные или положительные (по выбору пользователя) элементы массива
     * на сумму индексов элементов массива, соответствующих заявленной разрядности.
     *
     * @param inputArr - массив, в котором нужно произвести замены
     * @param grade    - искомое количество разрядов
     */
    public static void solution3(int[] inputArr, String whichElementsPosNeg, int grade) throws Exception {
        int numberType;
        if (whichElementsPosNeg.equalsIgnoreCase("positive") || whichElementsPosNeg.equalsIgnoreCase("pos")) {
            numberType = 1;
        } else if (whichElementsPosNeg.equalsIgnoreCase("negative") || whichElementsPosNeg.equalsIgnoreCase("neg")) {
            numberType = -1;
        } else {
            throw new Exception("Please choose correct type of elements: Positive (pos) or Negative (neg)");
        }
        int Counter = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (isAnyDigits(inputArr[i], grade)) {
                Counter += i;
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if ((inputArr[i] < 0 && numberType == -1) || (inputArr[i] > 0 && numberType == 1)) {
                inputArr[i] = Counter;
            }
        }
    }
}


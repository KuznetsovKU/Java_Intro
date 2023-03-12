package org.example.Homework_3.Hw_4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Infrastructure {
    /**
     * Модуль формирования массива, заполняемого с клавиатуры
     *
     * @param size - размер массива
     * @return - массив, заполненный введенными числами
     */
    public static List<Integer> getArr(int size) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter new element");
            result.add(scanner.nextInt());
        }
        return result;
    }


    /**
     * Модуль генерации всех возможных перестановок элементов массива
     *
     * @param inputArr - массив, для которого необходимо определить возможные перестановки
     * @return - массив массивов, включающий все возможные перестановки элементов исходного массива
     */
    public static List<List<Integer>> shuffle(List<Integer> inputArr) {
        if (inputArr.size() == 1) {
            List<List<Integer>> outputArr = new ArrayList<>();
            outputArr.add(inputArr);
            return outputArr;
        } else {
            List<List<Integer>> outputArr = new ArrayList<>();
            for (Integer el : inputArr) {
                List<Integer> subArr = new ArrayList<>(inputArr);
                subArr.remove(el);
                List<List<Integer>> subArr2 = shuffle(subArr);
                for (List<Integer> subEl : subArr2) {
                    List<Integer> subArr3 = new ArrayList<>();
                    subArr3.add(el);
                    subArr3.addAll(subEl);
                    outputArr.add(subArr3);
                }
            }
            return outputArr;
        }
    }
}

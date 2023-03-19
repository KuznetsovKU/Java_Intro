package org.example.Seminar_4.Cw_2;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
 * Заменить некратные 3 элементы списка, суммой нечетных элементов.
 */
public class Ex_2 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : someList) {
            if (el % 2 == 0) {
                sum += el;
            }
        }
        System.out.println(sum);


    }
}

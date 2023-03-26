package org.example.Seminar6.Cw1;

import java.util.*;

/**
 * 1) Дан массив чисел, посчитать процент уникальных чисел.
 * Процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2));
        Set<Integer> mySet = new HashSet<>(myArr);
        double result = mySet.size() * 100.0 / myArr.size();
        System.out.println(result);
    }
}

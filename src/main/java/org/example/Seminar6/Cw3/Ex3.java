package org.example.Seminar6.Cw3;

import java.util.*;

/**
 * 3) Найти пересечения слов в массивах и указать их общее количество.
 * Пример:
 * Mas1= [“qwe”,”asd”,”qwe”,”x”]
 * Mas2=[“qwe”,”v”]
 * Результат:
 * qwe=3
 */
public class Ex3 {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>(List.of("qwe", "asd", "qwe", "x", "v"));
        List<String> myList2 = new ArrayList<>(List.of("qwe", "v"));
        List<String> summList = new ArrayList<>(myList1);
        summList.addAll(myList2);

        Set<String> crossSet = new HashSet<>(myList1);
        crossSet.retainAll(myList2);
        for (String el : crossSet) {
            int count = 0;
            for (String item : summList) {
                if (el.equals(item)) count++;
            }
            System.out.println(el + " " + count);
        }

        System.out.println(countCrossing(myList1, myList2));
    }

    /**
     * Метод нахождения пересечений множеств и подсчета их количеств
     * @param inputList1 - первое множество
     * @param inputList2 - второе множество
     * @return - Map (ключ = повторяющийся элемент, значение = количество повторений)
     */
    public static Map<String, Integer> countCrossing (List<String> inputList1, List<String> inputList2) {
        List<String> summList = new ArrayList<>(inputList1);
        summList.addAll(inputList2);
        Map<String, Integer> result = new HashMap<>();
        for (String el : summList) {
            result.put(el, result.getOrDefault(el, 0) + 1);
        }
        Set<String> resSet = new HashSet<>(result.keySet());
        for (String el : resSet) {
            if (result.get(el) <= 1) {
                result.remove(el);
            }
        }
        return result;
    }
}

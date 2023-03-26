package org.example.Seminar6.Cw2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2) Найти пересечение двух множеств
 * Пример:
 * set1= [1,2,3,4]
 * set2= [3,5,6,7]
 * Вывод в консоль:
 * [3]
 */
public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> mySet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> mySet2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> crossSet = new HashSet<>(mySet1);
        crossSet.retainAll(mySet2);
        System.out.println(mySet1);
        System.out.println(mySet2);
        System.out.println(crossSet);
    }
}

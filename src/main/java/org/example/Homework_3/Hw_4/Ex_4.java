package org.example.Homework_3.Hw_4;

import org.example.Homework_3.Hw_4.model.Infrastructure;

import java.util.List;

/**
 * 4(*) при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
 * Пример входных данных:
 * [1,2,3]
 * Пример выходных данных:
 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Ex_4 {
    public static void main(String[] args) {
        List<Integer> inputArr = Infrastructure.getArr(3);
        System.out.println(inputArr);
        System.out.println();
        System.out.println(Infrastructure.shuffle(inputArr));
    }
}

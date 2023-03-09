package org.example.Seminar_2.cw_3;


/**
 * 3)Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */

public class Ex_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 5, 7, 3, 9, 4, 2, 1}));
    }

    public static int solution(int[] inputArr){
        int count = 0;
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i - 1] == inputArr[i] * 2) {
                count ++;
            }
        }
        return count;
    }
}

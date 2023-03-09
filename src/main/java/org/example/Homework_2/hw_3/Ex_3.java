package org.example.Homework_2.hw_3;

import org.example.Homework_2.hw_3.model.Infrastructure;

import java.util.Arrays;

public class Ex_3 {
    public static void main(String[] args) throws Exception {
        int[] someArr = Infrastructure.fillArray(10, -100, 100);
        System.out.println(Arrays.toString(someArr));
        Infrastructure.solution(someArr);
        System.out.println(Arrays.toString(someArr));
        int[] someArr2 = Infrastructure.fillArray(10, -1000, 1000);
        System.out.println(Arrays.toString(someArr2));
        Infrastructure.solution2(someArr2, 3);
        System.out.println(Arrays.toString(someArr2));
        int[] someArr3 = Infrastructure.fillArray(10, -100, 100);
        System.out.println(Arrays.toString(someArr3));
        Infrastructure.solution3(someArr3, "positive", 2);
        System.out.println(Arrays.toString(someArr3));
    }

}

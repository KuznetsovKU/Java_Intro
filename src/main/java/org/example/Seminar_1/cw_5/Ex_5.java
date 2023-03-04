package org.example.Seminar_1.cw_5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
//        int[] someArr = {1, 2, 3, 4};
        System.out.printf("result = %s", Arrays.toString(fillSumArr(fillArray())));

    }

    public static int[] fillSumArr(int[] inputArr){
        int[] outputArr = new int[inputArr.length];
        outputArr[0] = inputArr[0];
        for (int i = 1; i < outputArr.length; i++) {
            outputArr[i] = outputArr[i - 1] + inputArr[i];
        }
        return outputArr;
    }

    public static int[] fillArray(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int size = scanner1.nextInt();
        int[] outputArray = new int[size];
        System.out.println("Введите элементы массива через 'Enter'");
        Scanner scaner2 = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            outputArray[i] = scaner2.nextInt();
        }
        return outputArray;
    }
}

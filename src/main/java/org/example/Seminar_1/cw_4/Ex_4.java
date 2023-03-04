package org.example.Seminar_1.cw_4;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(checkArrSymmetry(someArray));
        System.out.println(checkArrSymmetry(fillArray(5)));

    }

    public static boolean checkArrSymmetry(int[] inputArr){
        for (int i = 0; i < inputArr.length / 2; i++) {
            if (inputArr[i] != inputArr[inputArr.length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    public static int[] fillArray(int size){
        int[] outputArray = new int[size];
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            outputArray[i] = scaner.nextInt();
        }
        return outputArray;
    }
}

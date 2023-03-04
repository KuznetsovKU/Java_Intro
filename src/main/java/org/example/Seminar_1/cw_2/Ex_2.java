package org.example.Seminar_1.cw_2;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int length = scaner.nextInt();
        System.out.printf("result = %d", someFunction(length));
    }

    public static int someFunction(int n) {
        Scanner scaner = new Scanner(System.in);
        int counter = 0;
        int lastNum = -1;
        for (int i = 0; i < n; i++) {
            int currentNum = scaner.nextInt();
            if (lastNum >= 0 && currentNum < 0) {
                counter++;
            }
            lastNum = currentNum;
        }
        return counter;
    }
}

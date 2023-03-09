package org.example.Seminar_2.cw_1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double x = scaner.nextDouble();
        int n = scaner.nextInt();
        scaner.close();
        System.out.println(pow(x, n));
    }

    public static double pow(double x, int n) {
        double result = 1;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
            return result;
        } else {
            for (int i = 0; i < -n; i++) {
                result *= x;
            }
            return 1 / result;
        }
    }
}

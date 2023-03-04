package org.example.Homework_1.hw_3;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binNum1 = scanner.nextLine();
        String binNum2 = scanner.nextLine();
        System.out.println(addBinary(binNum1, binNum2));
    }

    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}

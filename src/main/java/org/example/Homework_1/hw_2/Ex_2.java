package org.example.Homework_1.hw_2;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        System.out.println(solution());

    }

    public static int solution() {
        Scanner scanner = new Scanner(System.in);
        int lastNum = -1;
        int counter = 0;
        int currentNum = 1;
        while (currentNum != 0){
            currentNum = scanner.nextInt();
            if (lastNum >= 0 && currentNum < 0) {
                counter += lastNum;
            }
            lastNum = currentNum;
        }
        return counter;
    }
}

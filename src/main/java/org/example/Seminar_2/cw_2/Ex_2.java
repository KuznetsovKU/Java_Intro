package org.example.Seminar_2.cw_2;


import java.util.Scanner;

//2)Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
public class Ex_2 {
    public static void main(String[] args) {
        System.out.println(summ5());

    }

    public static int summ5(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int lastNum = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int currentNum = scanner.nextInt();
            if (currentNum % 10 == 5 && lastNum % 2 == 0){
                sum += currentNum;
            }
            lastNum = currentNum;
        }
        return sum;
    }
}


package org.example.Seminar5.Cw3;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        String number = "MCMXCIV";
        System.out.println(convertRomanToArabic(number));
        System.out.println(convertRomanToArabic2(number));
    }

    private static Integer convertRomanToArabic(String number) {
        String num = number + "0";
        Map<Character, Integer> romanDigits = new HashMap<>();
        romanDigits.put('0', 0);
        romanDigits.put('I', 1);
        romanDigits.put('V', 5);
        romanDigits.put('X', 10);
        romanDigits.put('L', 50);
        romanDigits.put('C', 100);
        romanDigits.put('D', 500);
        romanDigits.put('M', 1000);
        int counter = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            if (romanDigits.get(num.charAt(i)) < romanDigits.get(num.charAt(i + 1))) {
                counter += romanDigits.get(num.charAt(i + 1)) - romanDigits.get(num.charAt(i));
                i++;
            } else {
                counter += romanDigits.get(num.charAt(i));
            }
        }
        return counter;
    }

    private static Integer convertRomanToArabic2(String number) {
        Map<Character, Integer> romanDigits = new HashMap<>();
        romanDigits.put('I', 1);
        romanDigits.put('V', 5);
        romanDigits.put('X', 10);
        romanDigits.put('L', 50);
        romanDigits.put('C', 100);
        romanDigits.put('D', 500);
        romanDigits.put('M', 1000);
        int counter = romanDigits.get(number.charAt(number.length() - 1));
        for (int i = 0; i < number.length() - 1; i++) {
            if (romanDigits.get(number.charAt(i)) < romanDigits.get(number.charAt(i + 1))) {
                counter -= romanDigits.get(number.charAt(i));
            } else {
                counter += romanDigits.get(number.charAt(i));
            }
        }
        return counter;
    }
}

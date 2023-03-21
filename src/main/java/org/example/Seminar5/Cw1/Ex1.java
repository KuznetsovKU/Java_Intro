package org.example.Seminar5.Cw1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        String text = "asdiuvh aosdibvbaw ipaubdsdv";
        System.out.println(checkDuplicate(text));
        includesCount(text);
    }

    public static boolean checkDuplicate (String someString) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (char c : someString.toCharArray()) {
            if (c != ' ') {
                myMap.put(c, myMap.getOrDefault(c, 0) + 1);
                if (myMap.get(c) > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void includesCount (String someString) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < someString.length(); i++) {
            if (!myMap.containsKey(someString.charAt(i))) {
                myMap.put(someString.charAt(i), 1);
            } else {
                myMap.put(someString.charAt(i), myMap.get(someString.charAt(i)) + 1);
            }
        }
        for (var el : myMap.entrySet()) {
            System.out.println("element " + el.getKey() + " met " + el.getValue() + " time(s)");
        }
    }
}

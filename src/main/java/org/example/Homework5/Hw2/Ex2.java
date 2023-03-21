package org.example.Homework5.Hw2;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        String inputString = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String query = "Россия";
        System.out.println(wordCounter(inputString, query));
    }

    private static Integer wordCounter(String inputString, String query) {
        inputString = inputString.toLowerCase().replaceAll("[-+=*^!?.,:—;]", " ").trim();
        inputString = inputString.replaceAll("\\s+", " ");
        String[] inputArr = inputString.split(" ");
        query = query.toLowerCase();
        Map<String, Integer> dictionary = new HashMap<>();
        for (String s : inputArr) {
            if (s.equals(query)) {
                dictionary.put(s, dictionary.getOrDefault(s, 0) + 1);
            }
        }
        return dictionary.get(query);
    }

}

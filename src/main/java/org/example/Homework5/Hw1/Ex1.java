package org.example.Homework5.Hw1;


import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Ex1 {
    public static void main(String[] args) {
        String inputString = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println(wordsCounter(inputString));
    }

    /**
     * Метод, подсчитывающий количество вхождений каждого слова в строку (текст)
     *
     * @param inputString - входная строка (текст)
     * @return - словарь (HashMap), отражающий количество вхождений каждого слова в строку (текст)
     */
    private static Map<String, Integer> wordsCounter(String inputString) {
        inputString = inputString.toLowerCase().replaceAll("[-+=*^!?.,:—;]", " ").trim();
        inputString = inputString.replaceAll("\\s+", " ");
        String[] inputArr = inputString.split(" ");
        Map<String, Integer> dictionary = new HashMap<>();
        for (String s : inputArr) {
            dictionary.put(s, dictionary.getOrDefault(s, 0) + 1);
        }
        return dictionary;
    }
}

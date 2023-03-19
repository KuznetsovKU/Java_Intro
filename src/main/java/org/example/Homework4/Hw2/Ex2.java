package org.example.Homework4.Hw2;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "()[]{}";
        String text3 = "(]";

        System.out.println(text1);
        System.out.println(validate(text1));
        System.out.println(text2);
        System.out.println(validate(text2));
        System.out.println(text3);
        System.out.println(validate(text3));
    }

    /**
     * Метод проверяющий наличие соответствующих закрывающих скобок к открывающим
     * @param text - строка со скобками
     * @return - результат проверки
     */
    private static boolean validate(String text) {
        LinkedList<Character> hw2list = new LinkedList<>();
        for (char c : text.toCharArray()){
            if (c == ')' && hw2list.contains('(')) {
                hw2list.remove((Character)'(');
            } else if (c == ']' && hw2list.contains('[')) {
                hw2list.remove((Character)'[');
            } else if (c == '}' && hw2list.contains('{')) {
                hw2list.remove((Character)'{');
            }
            else hw2list.add(c);

        }
        return hw2list.isEmpty();
    }
}

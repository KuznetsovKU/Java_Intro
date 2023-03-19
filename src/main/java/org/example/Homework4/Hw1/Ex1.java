package org.example.Homework4.Hw1;


import java.util.LinkedList;
import java.util.List;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> hw1list = new LinkedList<>();
        hw1list.add(1);
        hw1list.add(2);
        hw1list.add(3);
        hw1list.add(4);

        System.out.println(hw1list);
        System.out.println(reverse(hw1list));
    }

    private static List<Integer> reverse(LinkedList<Integer> inputList) {
        LinkedList<Integer> outputList = new LinkedList<>();
        while (inputList.size() != 0) {
            outputList.addFirst(inputList.pop());
        }
        return outputList;
    }
}

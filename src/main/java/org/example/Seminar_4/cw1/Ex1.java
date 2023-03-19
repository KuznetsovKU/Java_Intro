package org.example.Seminar_4.cw1;

import java.util.LinkedList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            someList.add(i);
        }
        System.out.println("peek = " + someList.peek());
        System.out.println(someList);
        System.out.println("pop = " + someList.pop());
        System.out.println(someList);
        someList.addFirst(3);
        System.out.println("add First " + someList);
        someList.addLast(7);
        System.out.println("add Last " + someList);
        someList.remove((Integer) 3);
        System.out.println("remove " + someList);
        System.out.println(someList.contains(2));
    }
}

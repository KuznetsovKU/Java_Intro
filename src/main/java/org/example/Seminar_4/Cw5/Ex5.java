package org.example.Seminar_4.Cw5;

import java.util.Deque;
import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        String text1 = "/home/";
        String text2 = "/../";
        String text3 = "/home//foo/";
        System.out.println(text1);
        System.out.println(simplifyPath(text1));
        System.out.println(text2);
        System.out.println(simplifyPath(text2));
        System.out.println(text3);
        System.out.println(simplifyPath(text3));

    }
        public static String simplifyPath ( String path) {
            Deque<String> list = new LinkedList<>();
            String[] arr = path.split("/");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals("") || arr[i].equals(".")) continue;
                else if (arr[i].equals("..")) {
                    if (!list.isEmpty()) {
                        list.removeLast();
                    }
                }
                else {
                    list.add(arr[i]);
                }
            }
        return "/" + String.join("/", list);
    }
}

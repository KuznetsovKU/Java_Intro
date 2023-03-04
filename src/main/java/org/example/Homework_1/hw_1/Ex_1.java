package org.example.Homework_1.hw_1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(reverseText(text));

    }

    public static String reverseText(String inputText){
        String Text = inputText.replaceAll("\\s+", " ").trim();
        String[] textArr = Text.split(" ");
        String outputText = "";
        for (String word : textArr) {
            outputText = word + " " + outputText;
        }
        return outputText;
    }
}

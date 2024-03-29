package com.softuni;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        String repeatedText = repeatString(text, repetitions);
        System.out.println(repeatedText);
    }

    private static String repeatString(String text, int repetitions) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i <repetitions ; i++) {
            result.append(text);
        }
        return result.toString();
    }
}

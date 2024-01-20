package Fundamentals.Methods.Exc;

import java.util.Scanner;


public class PalindromeIntegersExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] array = convertToArray(input);
            String[] reversedArray = reverseToArray(input);

            if (compareArrays(array, reversedArray)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    public static String[] convertToArray(String text) {

        String[] numberArray = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            String currentSymbol = String.valueOf(text.charAt(i));
            numberArray[i] = currentSymbol;
        }
        return numberArray;
    }

    public static String[] reverseToArray(String text) {
        String[] numberArray = convertToArray(text);
        String[] reversedArray = new String[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = numberArray[numberArray.length - 1 - i];
        }
        return reversedArray;
    }

    public static boolean compareArrays(String[] arrayOne, String[] arrayTwo) {
        boolean areEqual = true;
        for (int i = 0; i <= arrayOne.length - 1; i++) {
            if (!arrayTwo[i].equals(arrayOne[i])) {
                areEqual = false;
                break;
            }
        }
        return areEqual;
    }
}

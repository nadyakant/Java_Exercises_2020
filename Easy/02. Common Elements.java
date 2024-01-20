package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //за всеки един елемент от масив2 обхождаме целия масив1
        String firstRow  = scanner.nextLine(); //"Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        String[] words1 = firstRow.split(" ");//["Hey", "hello", "2", "4"]
        String[] words2 = secondRow.split(" ");//["10", "hey", "4", "hello"]

        for (String word2 : words2) {
            for (String word1 : words1) {
                if(word2.equals(word1)) {
                    System.out.print(word2 + " ");
                    break;
                }
            }
        }




    }
}

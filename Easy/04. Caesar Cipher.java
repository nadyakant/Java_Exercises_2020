import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String sentence = scanner.nextLine();
       StringBuilder encryptedSentence = new StringBuilder();

        for (int index = 0; index <= sentence.length() - 1; index++) {
            char currentSymbol = sentence.charAt(index);
            encryptedSentence.append((char)(currentSymbol + 3));
        }

        System.out.println(encryptedSentence.toString());


    }

}
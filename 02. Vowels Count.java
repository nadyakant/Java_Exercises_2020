import java.util.Locale;
import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        printVowelsCount(text);

    }

    static void printVowelsCount (String text) {
        //a, e, i , o, u
        int count = 0; //броим гласните букви
        for (int index = 0; index <= text.length() - 1; index++) {
            //взимаме символа -> проверка дали е гласна буква
            char currentSymbol = text.charAt(index);
            switch(currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }


}
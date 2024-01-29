package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четен път на въвеждаме -> първото число -> масив 2; второто -> масив 1
        //нечетен път на въвеждане -> първото -> масив 1; второто -> масив 2
        int n = Integer.parseInt(scanner.nextLine());
        String [] array1 = new String[n];
        String [] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            //"1 5" -> ["1", "5"]
            String firstElement = input[0];
            String secondElement = input[1];

            if((i + 1) % 2 == 0) {
                array2[i] = firstElement;
                array1[i] = secondElement;
            } else {
                array1[i] = firstElement;
                array2[i] = secondElement;
            }
        }

        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));





    }
}

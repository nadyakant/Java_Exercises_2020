package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int[n];

        for (int index = 0; index < n; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);


    }
}

package LabBasicSyntax;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int sum = 0;
        for (int i = 1; odd < number; i++) {
            if (i % 2 > 0) {
                odd+=1;
            sum +=i;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}

package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class O1TestSortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int max = Math.max(Math.max(n1,n2),n3);
        int min = Math.min(Math.min(n1, n2), n3);
        int medium = (n1 + n2 + n3) - (max + min);

        System.out.println(max);
        System.out.println(medium);
        System.out.println(min);

    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                         .mapToInt(e -> Integer.parseInt(e)).toArray();
        //[1, 4, 3, 2]
        for (int index = 0; index <= numbers.length - 1; index++) {
            int number = numbers[index];
            //ако сме на послендото число от масива
            if(index == numbers.length - 1) {
                System.out.print(number);
                break;
            }
            boolean isBigger = false;
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                if(number > numbers[i]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if(isBigger) {
                System.out.print(number + " ");
            }

        }



    }
}

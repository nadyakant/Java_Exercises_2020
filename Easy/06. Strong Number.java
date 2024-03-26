import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        //сума от факториелите на цифрите
        //1. вземем всяка една цифра -> взимаме последната -> премахваме
        //2. намерим факториел
        //3. сумираме
        //4. проверка дали число == сума
        int sumFact = 0;
        while (number != 0) {
            //1. взимаме последната цифра
            int digit = number % 10;
            //2. намираме факториел -> 5 * 4 * 3 * 2 * 1
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            //3. сумираме
            sumFact += fact;
            //4. премахваме последната цифра от числото
            number /= 10;
        }

        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

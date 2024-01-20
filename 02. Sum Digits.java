import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. взимаме последната цифра
        //2. сумираме
        //3. премахваме последната цифра

        int number = Integer.parseInt(scanner.nextLine());
        //stop -> number == 0
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            //sum += lastDigit;
            number = number / 10;
            //number /= 10;
        }

        System.out.println(sum);
    }
}

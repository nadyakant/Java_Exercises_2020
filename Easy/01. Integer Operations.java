import java.util.Scanner;

class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. вход
        //2. Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number
        //3. принтираме резултат
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        int result = ((number1 + number2) / number3) * number4;
        System.out.println(result);
    }
}

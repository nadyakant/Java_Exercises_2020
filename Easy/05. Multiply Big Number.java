import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
       // System.out.println(firstNumber.add(secondNumber));
        //System.out.println(firstNumber.subtract(secondNumber));
        //System.out.println(firstNumber.divide(secondNumber));
        System.out.println(firstNumber.multiply(secondNumber));


    }

}

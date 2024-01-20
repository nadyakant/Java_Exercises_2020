import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            //0.1, 0.2, 0.5, 1, and 2
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        String productChoice = scanner.nextLine();

        while (!productChoice.equals("End")) {
            switch (productChoice) {
                case "Nuts":
                    if (sum - 2.0 >= 0) {
                        System.out.printf("Purchased %s%n", productChoice);
                        sum -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum - 0.7 >= 0) {
                        System.out.printf("Purchased %s%n", productChoice);
                        sum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum - 1.5 >= 0) {
                        System.out.printf("Purchased %s%n", productChoice);
                        sum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum - 0.8 >= 0) {
                        System.out.printf("Purchased %s%n", productChoice);
                        sum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum - 1.0 >= 0) {
                        System.out.printf("Purchased %s%n", productChoice);
                        sum -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default: {
                    System.out.println("Invalid product");
                }
            }
            productChoice = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        password.append(username);
        password.reverse();

        int counter = 1;
        String input = scanner.nextLine();
        while (counter <= 4) {
            if (input.equals(password.toString())) {
                break;
            }
            if (counter == 4) {
                break;
            }
            System.out.println("Incorrect password. Try again.");
            counter++;
            input = scanner.nextLine();
        }
        if (input.equals(password.toString())) {
            System.out.printf("User %s logged in.%n", username);
        } else {
            System.out.printf("User %s blocked!%n", username);
        }
    }
}

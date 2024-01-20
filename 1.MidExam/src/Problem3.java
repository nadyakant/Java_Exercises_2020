import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> neededCards = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        List<String> myCards = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("Ready")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Add":
                    String cardName = tokens[1];
                    if (neededCards.contains(cardName)) {
                        myCards.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    String insertCardName = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (neededCards.contains(insertCardName)) {
                        myCards.add(index, insertCardName);
                    } else if (!neededCards.contains(insertCardName) || index > neededCards.size() || index < 0) {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    String removeCardName = tokens[1];
                    if (myCards.contains(removeCardName)) {
                        myCards.remove(removeCardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    String swapCardName1 = tokens[1];
                    String swapCardName2 = tokens[2];
                    Collections.swap(myCards, myCards.indexOf(swapCardName1), myCards.indexOf(swapCardName2));

                    break;
                case "Shuffle deck":
                    Collections.reverse(myCards);
                    break;
            }
            command = scanner.nextLine();
        }

        for (String everyCard : myCards) {
            System.out.print(everyCard + " ");
        }
    }
}

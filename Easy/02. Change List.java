import java.util.*;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //[3,4,5,6]
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            //"Delete {element}" -> split -> ["Delete", "5"]
            //"Insert {element} {position}" -> ["Insert", "5", "3"]
            String command = input.split("\\s+")[0]; //Delete или Insert
            int element = Integer.parseInt(input.split("\\s+")[1]);

            if (command.equals("Delete")) {
                numbers.removeAll(Arrays.asList(element));
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\s+")[2]);
                numbers.add(index, element);
            }
            input = scanner.nextLine();
        }

        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

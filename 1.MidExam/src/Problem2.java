import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        List<Integer> countOfSugarCubes = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("Mort")) {
            String[] commandsArray = command.split(" ");
            String currentCommandName = commandsArray[0];

            switch (currentCommandName){
                case "Add":
                    int toAdd = Integer.parseInt(commandsArray[1]);
                            countOfSugarCubes.add(toAdd);

                    break;
                case "Remove":
                    int removeValue = Integer.parseInt(commandsArray[1]);
                    for (Integer element : countOfSugarCubes){
                        if (element == removeValue){
                            countOfSugarCubes.remove(element);
                            break;
                        }
                        }
                    break;
                case "Replace":
                    int replaceValue = Integer.parseInt(commandsArray[1]);
                    int replacement = Integer.parseInt(commandsArray[2]);
                    int indexToReplace = 0;
                    for (Integer element : countOfSugarCubes){
                        if(element == replaceValue){
                            countOfSugarCubes.set(indexToReplace, replacement);
                            break;
                        }
                        indexToReplace++;
                    }

                    break;
                case "Collapse":
                    int toCollapse = Integer.parseInt(commandsArray[1]);

                    for (Iterator<Integer> iterator = countOfSugarCubes.iterator(); iterator.hasNext(); ) {
                        Integer value = iterator.next();
                        if (value < toCollapse) {
                            iterator.remove();
                        }
                    }

                    break;
            }
            command = scanner.nextLine();
        }
        for(Integer sugarCube : countOfSugarCubes) {
            System.out.print(sugarCube + " ");
        }
    }
}

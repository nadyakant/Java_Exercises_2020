import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder receivedText = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String commandName = tokens[0];
            String receivedTextAsString = receivedText.toString();

            switch (commandName) {
                case "Change":
                    String oldChar = tokens[1];
                    String newChar = tokens[2];

                    receivedTextAsString = receivedTextAsString.replace(oldChar, newChar);
                    receivedText = new StringBuilder(receivedTextAsString);
                    System.out.println(receivedText);
                    break;
                case "Includes":
                    String lookFor = tokens [1];

                    if(input.contains(lookFor)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }

                    break;
                case "End":
                    String ending = tokens [1];
                    boolean endsWith = receivedTextAsString.endsWith(ending);
                    if(endsWith) {
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }

                    break;
                case "Uppercase":
                    String upperCaseString = receivedTextAsString.toUpperCase();
                    System.out.println(upperCaseString);

                    break;
                case "FindIndex":
                    String missingIndex = tokens[1];
                    int index1=receivedTextAsString.indexOf(missingIndex);
                    if(index1 != -1) {
                        System.out.println(index1);
                    }else{
                        String upperCase = receivedTextAsString.toUpperCase();
                        int index2 = upperCase.indexOf(missingIndex);
                        System.out.println(index2);
                    }
                    break;
                case "Cut":
                    int BeginIndex = Integer.parseInt(tokens[1]);
                    int EndIndex = Integer.parseInt(tokens[2]);

                    StringBuilder upperCaseBuilder =  new StringBuilder(receivedTextAsString.toUpperCase());
                    
                    if (BeginIndex >= 0 && BeginIndex < receivedTextAsString.length() &&
                            EndIndex >= 0 && EndIndex < receivedTextAsString.length()) {
                        upperCaseBuilder.delete(0, BeginIndex);
                        upperCaseBuilder.delete(EndIndex, 200);
                    }
                    System.out.println(upperCaseBuilder);

                    break;
            }

            input = scanner.nextLine();
        }




    }
}

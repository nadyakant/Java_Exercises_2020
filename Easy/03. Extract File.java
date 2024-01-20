import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // C:\Internal\training-internal\Template.pptx -> split \
        // ["C:", "Internal", "training-internal", "Template.pptx"] -> [length - 1]
        // -> "Template.pptx" -> split . -> ["Template", "pptx"]
        String path = scanner.nextLine();
        String [] pathParts = path.split("\\\\");
        String fullFileName = pathParts[pathParts.length - 1];
        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);


    }

}
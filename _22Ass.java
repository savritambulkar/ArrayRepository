import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 class FileReaderExample {

    public static void main(String[] args) {
        String filename = "input.txt"; // Replace with your file path
        try {
            String content = readFile(filename);
            System.out.println("File content:");
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method to read a file and return its content as a string
    public static String readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        StringBuilder contentBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                contentBuilder.append(scanner.nextLine());
                contentBuilder.append("\n");
            }
        }
        return contentBuilder.toString();
    }
}

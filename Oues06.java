import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Oues06 {

    public static void main(String[] args) {
        String fileName = "image250.jpg"; // Replace with your image file path
        int internetSpeedBps = 256; // Internet speed in bits per second

        try {
            File file = new File(fileName);
            long fileSizeBytes = file.length();

            System.out.println("File Size: " + fileSizeBytes + " bytes");

            double fileSizeBits = fileSizeBytes * 8.0; // Convert bytes to bits
            double uploadTimeSeconds = fileSizeBits / (internetSpeedBps * 2.0); // Calculate upload time in seconds

            System.out.printf("Estimated Upload Time: %.2f seconds\n", uploadTimeSeconds);

        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

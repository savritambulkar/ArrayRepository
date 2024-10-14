import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 class ShoppingTotal {
    public static void main(String[] args) {
        String fileName = "Ass08.txt"; // Replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            double totalMoney = 0.0;

            while ((line = br.readLine()) != null) {
                // Assuming each line contains item,price format separated by comma
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    try {
                        double price = Double.parseDouble(parts[1].trim());
                        totalMoney += price;
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing price for line: " + line);
                        // You might choose to skip or handle this error differently
                    }
                } else {
                    System.err.println("Invalid line format: " + line);
                    // You might choose to skip or handle this error differently
                }
            }

            System.out.printf("Total money spent: $%.2f%n", totalMoney);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}


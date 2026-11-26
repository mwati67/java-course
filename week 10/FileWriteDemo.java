// This program demonstrates how to write data to a text file.
// It uses try-with-resources to ensure the file is closed automatically.

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteDemo {
    public static void main(String[] args) {
        String fileName = "transactions.txt";

        try (FileWriter fw = new FileWriter(fileName);
             PrintWriter pw = new PrintWriter(fw)) {

            System.out.println("Writing to file: " + fileName);

            pw.println("TRX001, DEPOSIT, 5000, SUCCESS");
            pw.println("TRX002, WITHDRAW, 2000, SUCCESS");
            pw.println("TRX003, DEPOSIT, 15000, SUCCESS");
            pw.println("TRX004, TRANSFER, 1000, FAILED");

            if (pw.checkError()) {
                System.out.println("An error occurred while writing.");
            } else {
                System.out.println("Data written successfully!");
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

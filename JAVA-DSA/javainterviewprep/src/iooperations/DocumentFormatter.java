package iooperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocumentFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            System.out.println("Enter the name of the new formatted file: ");
            String outputFileName = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Remove extra spaces between words
                    line = line.replaceAll("\\s+", " ");
                    writer.println(line);
                }

                System.out.println("Document formatted and stored in " + outputFileName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

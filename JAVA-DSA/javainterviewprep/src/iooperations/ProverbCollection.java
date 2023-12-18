package iooperations;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

    public static void storeProverb(String proverb) {
        try (FileWriter writer = new FileWriter("TopProverbs.txt", true)) {
            writer.write(proverb + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String proverb;

        do {
            System.out.println("Enter a proverb (or type 'STOP' to end): ");
            proverb = scanner.nextLine();

            if (!proverb.equalsIgnoreCase("STOP")) {
                storeProverb(proverb);
            }

        } while (!proverb.equalsIgnoreCase("STOP"));

        System.out.println("Proverbs stored successfully in TopProverbs.txt");
    }
}

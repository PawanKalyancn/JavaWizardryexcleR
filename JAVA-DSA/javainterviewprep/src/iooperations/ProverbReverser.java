package iooperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProverbReverser {

    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("TopProverbs.txt"));
             FileWriter writer = new FileWriter("ReverseProverbs.txt")) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    writer.write(reverseWord(word) + " ");
                }
                writer.write(System.lineSeparator());
            }

            System.out.println("Proverbs reversed and stored in ReverseProverbs.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

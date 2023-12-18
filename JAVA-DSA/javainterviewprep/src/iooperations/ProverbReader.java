package iooperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProverbReader {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("TopProverbs.txt"))) {
            String line;

            System.out.println("Proverbs stored in TopProverbs.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

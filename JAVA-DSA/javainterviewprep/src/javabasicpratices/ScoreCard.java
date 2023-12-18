package javabasicpratices;
import java.util.*;

public class ScoreCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        //(e.g., Rahane-20 Rahul-30 Kohli-150 Dhoni-50 Lokesh-2)

        // Prompt the user to enter runs scored by players in the format: "Player-Runs Player-Runs ..."
        System.out.println("Enter Runs Scored ");
        String input = scanner.nextLine();

        scanner.close();

        // Split the input string by space to separate player names and their runs.
        String[] playerRuns = input.split(" ");

        // Create a HashMap to store player names and their respective runs.
        Map<String, Integer> runsByPlayers = new HashMap<>();

        // Iterate through each entry (Player-Runs) and add it to the HashMap.
        for (String entry : playerRuns) {
            String[] parts = entry.split("-");
            String player = parts[0];
            int runs = Integer.parseInt(parts[1]);
            runsByPlayers.put(player, runs);
        }

        // Display the names of players who batted.
        System.out.println("Players who batted");
        runsByPlayers.keySet().forEach(System.out::println);

        // Display the scores of players in ascending order of their names (sorted by TreeMap).
        System.out.println("\nScores by Players");
        Map<String, Integer> sortedRunsByPlayers = new TreeMap<>(runsByPlayers);
        for (Map.Entry<String, Integer> entry : sortedRunsByPlayers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Calculate and display the total score.
        int totalScore = runsByPlayers.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nTotal Score: " + totalScore);

        // Find the highest score and the name of the highest scorer.
        int highestScore = Collections.max(runsByPlayers.values());
        String highestScorer = "";
        for (Map.Entry<String, Integer> entry : runsByPlayers.entrySet()) {
            if (entry.getValue() == highestScore) {
                highestScorer = entry.getKey();
                break;
            }
        }

        // Display the name and score of the highest scorer.
        System.out.println("\nName of Highest Scorer: " + highestScorer);
        System.out.println(highestScorer + " scored " + runsByPlayers.get(highestScorer) + " runs.");
    }
}

package javadsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ScoreCard {

	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter Runs Scored");
		        String input = scanner.nextLine();

		        // Split the input into individual scores
		        String[] scores = input.split(" ");

		        Map<String, Integer> playerScores = new HashMap<>();

		        // Process each score and store it in the map
		        for (String score : scores) {
		            String[] parts = score.split("-");
		            if (parts.length == 2) {
		                String playerName = parts[0];
		                int runs = Integer.parseInt(parts[1]);
		                playerScores.put(playerName, runs);
		            }
		        }

		        // Sort the players by their scores
		        List<Map.Entry<String, Integer>> sortedPlayers = new ArrayList<>(playerScores.entrySet());
		        sortedPlayers.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

		        // Print the results
		        System.out.println("Players who batted");
		        for (Map.Entry<String, Integer> entry : sortedPlayers) {
		            System.out.println(entry.getKey());
		        }

		        System.out.println("\nScores by Players");
		        int totalScore = 0;
		        String highestScorer = "";
		        int highestScore = Integer.MIN_VALUE;

		        for (Map.Entry<String, Integer> entry : sortedPlayers) {
		            String playerName = entry.getKey();
		            int runs = entry.getValue();
		            System.out.println(playerName + " : " + runs);

		            totalScore += runs;

		            if (runs > highestScore) {
		                highestScorer = playerName;
		                highestScore = runs;
		            }
		        }

		        System.out.println("\nTotal Score : " + totalScore);
		        System.out.println("Name of Highest Scorer : " + highestScorer);
		        System.out.println("Runs Scored by " + highestScorer + " : " + highestScore);
		    }
		

		
		
	}


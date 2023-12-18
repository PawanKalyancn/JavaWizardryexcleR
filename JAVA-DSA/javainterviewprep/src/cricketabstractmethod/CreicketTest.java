package cricketabstractmethod;

import java.util.Scanner;

public class CreicketTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("==========Inheritance and Abstraction==============");
        System.out.print("Enter Target Runs: ");
        int targetRuns = scanner.nextInt();

        System.out.print("Enter Current Over: ");
        int currentOver = scanner.nextInt();

        System.out.print("Enter Current Score: ");
        int currentScore = scanner.nextInt();

        OneDayCricket oneDayCricket = new OneDayCricket(targetRuns);
        oneDayCricket.setCurrentOver(currentOver);
        oneDayCricket.setCurrentScore(currentScore);

        double currentRunRate = oneDayCricket.calcCurrentRunrate();
        double requiredRunRate = oneDayCricket.calcReqdRunrate();

        System.out.println("Current Run Rate: " + currentRunRate);
        System.out.println("Required Run Rate: " + requiredRunRate);
    }
}

/*

2- Inheritance and Abstraction
**Create an abstract class Cricket with following private member variables**
     maxOvers(int) targetScore(int) , currentOver(int), currentScore(int)  

* Provide getter methods for all variables. 
* Provide setter methods for currentOver and currentScore.
* Set the maxOvers and targetScore in the Constructor
* Create abstract methods calcCurrentRunrate and calcReqdRunrate which return a double 
    
Create SubClass of Cricket named OneDayCricket. maxOvers for one day cricket is fixed at 50.

* Implement the abstract methods as follows:
* Current Run rate is calculated using formula current Score / current over.  
* Required Run rate is calculated using formula Remaining Runs / Remaining overs.

* Create CricketTest class with main method.
   * Using scanner to accept the target runs, current over, current score
   * Create object of Oneday cricket with the accepted target runs 
   * Set the current over and current score
   * Display the current Run rate and Required run rate in the output

		Sample Input :
		Enter Target Runs
		250
		Enter Current Over
		25
		Enter Current Score
		125
		
		Sample Output :
	       Current Run Rate
	      5.0
	      Required Run Rate
	      5.0




*/
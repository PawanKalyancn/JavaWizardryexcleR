package javabasicpratices;

import java.util.ArrayList;        // Import ArrayList class from the java.util package.
import java.util.Collections;      // Import Collections class for sorting.
import java.util.Iterator;         // Import Iterator class for iterating through the ArrayList.
import java.util.Scanner;          // Import Scanner class for user input.

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input.

        while (true) {  // Start an infinite loop to keep running the program until explicitly exited.

            System.out.println("Enter the number of students");  // Prompt the user to enter the number of students.

            int no_students = scanner.nextInt();  // Read the number of students entered by the user.

            ArrayList<Integer> marks = new ArrayList<>();  // Create an ArrayList to store student marks.

            System.out.println("Enter the marks");  // Prompt the user to enter the marks.

            for (int i = 0; i < no_students; i++) {  // Loop to read and store student marks in the ArrayList.
                int mark = scanner.nextInt();  // Read a student's mark.
                marks.add(mark);  // Add the mark to the ArrayList.
            }

            int highest_marks = Collections.max(marks);  // Find the highest mark in the ArrayList.
            System.out.println("Highest marks are " + highest_marks);  // Display the highest mark.

            double sum = 0;  // Initialize a variable to store the sum of all marks.
            for (int mark : marks) {
                sum = sum + mark;  // Calculate the sum of all marks.
            }

            double avg_marks = sum / no_students;  // Calculate the average mark.
            System.out.println("Average marks: " + avg_marks);  // Display the average mark.

            // Check if there are at least 3 students before accessing the 3rd student's mark.
            if (no_students >= 3) {
                int thirdStudentMark = marks.get(2);  // Get the mark of the 3rd student.
                System.out.println("3rd Student marks: " + thirdStudentMark);  // Display the 3rd student's mark.
            } else {
                System.out.println("Not enough students for 3rd student's mark.");  // Display a message if there are not enough students.
            }

            Collections.sort(marks);  // Sort the marks in ascending order.
            System.out.print("Sorted marks: ");  // Display a message before the sorted marks.

            Iterator<Integer> iterator = marks.iterator();  // Create an iterator to traverse the sorted marks.
            int studentNumber = 1;  // Initialize a variable to keep track of the student number.
            while (iterator.hasNext()) {  // Loop to iterate through and display the sorted marks.
                System.out.print(studentNumber + "-" + iterator.next());  // Display student number and mark.
                if (iterator.hasNext()) {
                    System.out.print(" ");  // Add a space if there are more marks.
                }
                studentNumber++;  // Increment the student number.
            }

            System.out.println("\nDo you wish to continue? Press Y or N");  // Ask the user if they want to continue or exit.

            char choice = scanner.next().charAt(0);  // Read the user's choice (Y or N).

            if (choice == 'N' || choice == 'n') {
                System.out.println("Exiting the program.");  // If the user chooses to exit, display an exit message.
                break;  // Exit the infinite loop.
            }
        }

        scanner.close();  // Close the Scanner to release system resources.
    }
}

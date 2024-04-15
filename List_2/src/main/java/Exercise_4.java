/*
Create a program that reads 2 grades of a student, checks if the grades are valid (between 0.0 and 10.0),
and displays the average. If a grade is invalid, inform the user and terminate the program.
 */
import java.util.Scanner;

public class Exercise_4 {
    /**
     * Prompts the user to enter a grade between 0.0 and 10.0.
     * This method loops until the user enters a valid grade. It displays an error message
     * if the entered grade is outside the valid range (0.0 to 10.0).
     *
     * @param input The Scanner object used to read user input.
     * @param msg The message to display to the user prompting for a grade.
     * @return The valid grade entered by the user (between 0.0 and 10.0).
     */
    public static float askGrade(Scanner input, String msg) {
        float grade;

        // Loop until a valid grade between 0 and 10 is entered
        do {
            System.out.println(msg);
            grade = input.nextFloat();

            // Check if the grade is not between 0 and 10
            if (grade < 0 || grade > 10) {
                System.out.println("Please enter a valid grade");
            }
        } while (grade < 0 || grade > 10); // Repeat the loop if the grade is not valid

        return grade; // Return the valid grade

    }public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Call the askGrade method to get the first and second grades from the user
        float grade1 = askGrade(input, "Enter the first grade: ");
        float grade2 = askGrade(input, "Enter the second grade: ");

        // Calculate the average of the grades
        float average = (grade1 + grade2) / 2;

        // Print the average
        System.out.println("The average is " + average);
    }
}
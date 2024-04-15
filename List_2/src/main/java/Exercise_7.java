// Generates random addition questions, checks user's answers, and displays results

import java.util.Random;
import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // Arrays to store correct questions and answers
        String[] correctQuestions = new String[5];  // Array to store questions answered correctly
        int[] correctAnswersArray = new int[5];     // Array to store correct answers
        int correctAnswersCount = 0;                // Counter for correct answers

        System.out.println("Math Test - Addition of Numbers Less than 100");

        // Generate and display questions, and get user's answers
        for (int i = 0; i < 5; i++) {
            // Generate two random numbers between 1 and 100
            int num1 = rand.nextInt(100) + 1;  // Generate random number between 1 and 100
            int num2 = rand.nextInt(100) + 1;  // Generate random number between 1 and 100

            // Create and display the question
            String question = String.format("Question %d: %d + %d?", i + 1, num1, num2);
            System.out.println(question);

            // Store the correct answer
            correctAnswersArray[i] = num1 + num2;

            // Get the user's answer
            System.out.print("Enter the sum: ");
            int userAnswer = input.nextInt();

            // Check if the answer is correct
            if (userAnswer == correctAnswersArray[i]) {
                correctAnswersCount++;
                correctQuestions[i] = question;  // Store the question that was answered correctly
            }
        }

        // Display results
        System.out.println("\nTest Results:");
        System.out.println("Correct Answers: " + correctAnswersCount + "/5");
        System.out.println("Questions answered correctly:");

        // Print questions answered correctly
        for (String question : correctQuestions) {
            if (question != null) {  // Check if question is not null (answered correctly)
                System.out.println(question);
            }
        }
    }
}

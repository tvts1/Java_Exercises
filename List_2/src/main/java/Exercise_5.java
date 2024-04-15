/*
Write a program that reads a positive integer and displays the sum of its digits.
For example, for the number 251, the output should be 8 (2 + 5 + 1).
If the number is not greater than zero, the program should display 'Invalid number' and terminate.
 */

import java.util.Scanner;

public class Exercise_5 {

    /**
     * Calculates the sum of digits of a given number.
     *
     * @param num The number to calculate the sum of digits.
     * @return The sum of digits of the given number.
     */
    public static int sumDigits(int num) {
        // Convert the number to a string
        String numStr = Integer.toString(num);
        // Initialize sum to 0
        int sum = 0;

        // Iterate through each character of the string
        for (int i = 0; i < numStr.length(); i++) {
            // Convert the character to an integer and add it to the sum
            sum += numStr.charAt(i) - '0';
        }

        // Return the sum of digits
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number greater than zero
        System.out.println("Enter a number greater than zero: ");
        // Read the input number
        int num = input.nextInt();

        // Check if the number is greater than zero
        if (num > 0) {
            // Calculate the sum of digits using the sumDigits method
            int result = sumDigits(num);
            // Display the result
            System.out.println("The sum of digits is " + result);
        } else {
            // Inform the user that the number is invalid
            System.out.println("Invalid number. Please try again.");
        }
    }
}
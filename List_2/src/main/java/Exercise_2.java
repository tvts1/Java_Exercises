/*
Read a number provided by the user. If the number is positive, calculate its square root.
If the number is negative, display a message saying it's invalid.
*/

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive number to find its square root
        System.out.println("Enter a positive number to find its square root: ");
        // Read the number entered by the user
        int num = input.nextInt();

        // Check if the number is positive
        if (num > 0) {
            // If the number is positive, calculate and print its square root
            System.out.println("The square root of the number is " + Math.sqrt(num));
        } else {
            // If the number is not positive, print an error message
            System.out.println("Invalid number. Please try again.");
        }
    }
}

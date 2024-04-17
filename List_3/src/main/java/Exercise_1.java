/*
* Write a program that reads an integer and calculates the sum of all its divisors, excluding itself
* */

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number to find its divisors and sum
        System.out.println("Enter a number to find its divisors and sum: ");

        // Read the input number from the user
        int number = input.nextInt();

        // Initialize sum variable to store the sum of divisors
        int sum = 0;

        // Iterate from 1 to (number - 1) to find divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if 'i' is a divisor of 'number'
            if (number % i == 0) {
                // If 'i' is a divisor, add it to the sum
                sum += i;
            }
        }
        // Print the sum of divisors
        System.out.println("Sum of divisors: " + sum);
    }
}

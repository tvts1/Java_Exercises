/**
 * Three friends played the lottery. If they win, the prize should be divided proportionally
 * to the amount each contributed to the bet. Write a program that reads how much each bettor invested,
 * the prize amount, and prints how much each would win from the prize based on the invested amount.
 *
 */

import java.util.Scanner;

public class Exercise_8 {
    // Maximum number of friends
    private static final int NUM_FRIENDS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] investedAmount = new double[NUM_FRIENDS];

        // Request the invested amounts from each friend
        for (int i = 0; i < NUM_FRIENDS; i++) {
            System.out.printf("Enter the amount invested by friend %d: ", i + 1);
            investedAmount[i] = input.nextDouble();
        }

        // Request the prize amount
        System.out.print("Enter the prize amount: ");
        double prizeAmount = input.nextDouble();

        // Calculate and display the individual prize amount for each friend
        double[] individualPrize = calculatePrize(investedAmount, prizeAmount);
        for (int i = 0; i < NUM_FRIENDS; i++) {
            System.out.printf("The amount received by friend %d is $%.2f\n", i + 1, individualPrize[i]);
        }
    }

    // Method to calculate the individual prize for each friend
    public static double[] calculatePrize(double[] investedAmount, double prizeAmount) {
        // Calculate the total invested amount
        double totalAmount = 0;
        for (double amount : investedAmount) {
            totalAmount += amount;
        }

        // Calculate the percentage of investment for each friend
        double[] percentagePerPerson = new double[NUM_FRIENDS];
        for (int i = 0; i < NUM_FRIENDS; i++) {
            percentagePerPerson[i] = (investedAmount[i] / totalAmount) * 100;
        }

        // Calculate the individual prize amount for each friend
        double[] finalAmountPerPerson = new double[NUM_FRIENDS];
        for (int i = 0; i < NUM_FRIENDS; i++) {
            finalAmountPerPerson[i] = (percentagePerPerson[i] * prizeAmount) / 100;
        }

        return finalAmountPerPerson;
    }
}

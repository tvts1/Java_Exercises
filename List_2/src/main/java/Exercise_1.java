// Make a program that receives two numbers and shows which one is the largest

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        int num1, num2;

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        // Read the first number entered by the user
        num1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        // Read the second number entered by the user
        num2 = input.nextInt();

        // Check which number is greater
        if (num1 > num2) {
            // If num1 is greater than num2, print this message
            System.out.println("First number > Second number");
        } else if (num2 > num1) {
            // If num2 is greater than num1, print this message
            System.out.println("Second number > First number");
        } else {
            // If both numbers are equal, print this message
            System.out.println("They are equal");
        }
    }
}
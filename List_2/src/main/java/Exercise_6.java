/*
Display the menu options below. Read the user's choice and execute the selected operation.
Write an error message if the option is invalid.
*/
import java.util.Scanner;

public class Exercise_6 {

    // Display the menu options
    public static void displayMenu() {
        System.out.println("1 - ADD TWO NUMBERS");
        System.out.println("2 - SUBTRACT TWO NUMBERS");
        System.out.println("3 - MULTIPLY TWO NUMBERS");
        System.out.println("4 - DIVIDE TWO NUMBERS");
        System.out.println("5 - EXIT");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op; // Variable to store user's choice

        // Loop to keep displaying menu until user chooses to exit
        do {
            displayMenu(); // Display the menu options

            System.out.print("Enter your choice: ");
            op = input.nextInt(); // Get user's choice

            // Check if the choice is between 1 and 4
            if (op >= 1 && op <= 4) {
                System.out.println("Enter the first number: ");
                float num1 = input.nextFloat(); // Get first number

                System.out.println("Enter the second number: ");
                float num2 = input.nextFloat(); // Get second number

                // Perform the operation based on user's choice
                switch (op) {
                    case 1:
                        System.out.println("The result is " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("The result is " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("The result is " + (num1 * num2));
                        break;
                    case 4:
                        // Check if second number is zero before dividing
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero");
                        } else {
                            System.out.println("The result is " + (num1 / num2));
                        }
                        break;
                }
            }
            // Check if choice is not 5 (EXIT) and not between 1 and 4
            else if (op != 5) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (op != 5); // Continue looping until user chooses to exit
    }
}
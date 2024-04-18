/**
 * This program finds all combinations of three numbers (a, b, c) that sum up to a given number.
 * It uses nested loops with conditions to ensure that the combinations are unique and valid.
 */
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        boolean found = false;

        System.out.println("Combinations of three numbers that sum up to " + number + ":");

        // Loop for variable 'a'
        for (int a = 0; a <= number; a++) {

            // Loop for variable 'b'
            for (int b = a + 1; b <= number - a; b++) {

                // Calculating the value of 'c'
                int c = number - a - b;

                // Checking if 'c' is greater than or equal to 'b'
                if (c >= b) {
                    System.out.println(a + " + " + b + " + " + c + " = " + number);
                    found = true;
                }
            }
        }

        // Checking if any combination was found
        if (!found) {
            System.out.println("No combinations found for the number " + number);
        }
    }
}

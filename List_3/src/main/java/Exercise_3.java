/**
 * This program calculates the roots of a quadratic equation given coefficients a, b, and c.
 * It determines the nature and number of roots based on the discriminant (delta) and uses
 * the quadratic formula to calculate the roots. The program handles cases of two distinct
 * real roots, a single real root (root with multiplicity 2), and no real roots.
 */


import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter coefficients a, b, and c
        System.out.println("Enter coefficient a: ");
        double a = input.nextInt();

        System.out.println("Enter coefficient b: ");
        double b = input.nextInt();

        System.out.println("Enter coefficient c: ");
        double c = input.nextInt();

        // Calculate the discriminant (delta) using the formula
        double delta = Math.pow(b, 2) - (4 * a * c);

        // Check the value of delta to determine the nature and number of roots
        if (delta > 0) {
            // Calculate two distinct real roots using the quadratic formula
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Print the two roots with two decimal places
            System.out.printf("The roots are x1: %.2f and x2: %.2f\n", x1, x2);
        } else if (delta == 0) {
            // Calculate a single real root (root with multiplicity 2)
            double x = -b / (2 * a);

            // Print the single root
            System.out.println("The root value is x = " + x);
        } else {
            // If delta is negative, the equation has no real roots
            System.out.println("There are no real roots for the equation");
        }

        // Close the Scanner
        input.close();
    }
}

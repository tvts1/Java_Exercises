// Calculating the hypotenuse of a right triangle, given the lengths of its legs.

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double leg1, leg2;

        // Get user input for the leg lengths
        System.out.println("Enter the length of the first leg: ");
        leg1 = input.nextDouble();

        // Calculate the hypotenuse using Math.sqrt and Math.pow
        System.out.println("Enter the length of the first leg: ");
        leg2 = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        System.out.println("The hypotenuse of the triangle is " + hypotenuse);

        input.close();
    }
}

// Read four grades, calculate the arithmetic mean and print the result.

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade_1, grade_2, grade_3, grade_4;

        // Read four grades from the user
        System.out.println("Enter the first grade: ");
        grade_1 = input.nextDouble();

        System.out.println("Enter the second grade: ");
        grade_2 = input.nextDouble();

        System.out.println("Enter the third grade: ");
        grade_3 = input.nextDouble();

        System.out.println("Enter the fourth grade: ");
        grade_4 = input.nextDouble();

        // Calculate the arithmetic mean
        double arithmeticMean = (grade_1 + grade_2 + grade_3 + grade_4) / 4.0;

        System.out.println("The arithmetic mean is " + arithmeticMean);
    }
}

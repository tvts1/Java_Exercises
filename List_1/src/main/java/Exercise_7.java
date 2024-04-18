/*Program to calculate birth year from age and current year*/

import java.util.Scanner;
import java.time.Year;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define present year
        int presentYear = Year.now().getValue();

        // Get birth year from the user
        System.out.println("Enter your year of birth: ");
        int birthYear = input.nextInt();

        // Calculate age
        int age = presentYear - birthYear;

        System.out.printf("You are %d years old\n", age);
    }
}


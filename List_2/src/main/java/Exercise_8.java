// Determine if a Given Year is a Leap Year

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input the year
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        // Checking if the year is a leap year
        if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
            // If the year is divisible by 400 or divisible by 4 but not divisible by 100,
            // it is a leap year
            System.out.println("The year is a leap year");
        } else {
            // If the conditions for a leap year are not met, it is not a leap year
            System.out.println("The year is not a leap year");
        }

        // Closing the scanner to prevent resource leak
        sc.close();
    }
}

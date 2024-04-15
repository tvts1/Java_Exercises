// make a program that receives an integer and checks if this number is even or odd

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        // Read the number entered by the user
        int num = input.nextInt();

        // Check if the number is even
        if (num % 2 == 0) {
            // If the number is even, print "It's even"
            System.out.println("It's even");
        } else {
            // If the number is odd, print "It's odd"
            System.out.println("It's odd");
        }
    }
}
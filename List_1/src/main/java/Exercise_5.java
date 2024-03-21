/** Write a program that reads a positive three-digit integer (from 100 to 999)
Generate another number formed by the reversed digits of the input number.
*/

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int originalNumber;

        // Get the integer from the user
        System.out.println("Enter integer of three digits: ");
        originalNumber = input.nextInt();

        int unit, ten, hundred, reversedNumber;

        // Extract individual digits from the input number
        unit = originalNumber % 10;
        ten = (originalNumber / 10) % 10;
        hundred = originalNumber / 100;

        // Form the reversed number by rearranging the digits
        reversedNumber = unit * 100 + ten * 10 + hundred;

        System.out.println("Inverted number: " + reversedNumber);
    }
}
// Celsius to Fahrenheit Converter

import java.util.Scanner; 

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for temperature in Celsius
        System.out.println("Enter temperature in Celsius:");
        float celsius = input.nextFloat();

        // Convert Celsius for Fahrenheit
        double fahrenheit = celsius * (9.0 / 5.0) + 32;

        // Result in Fahrenheit
        System.out.println("Temperature in Fahrenheit " + fahrenheit);
    }
}

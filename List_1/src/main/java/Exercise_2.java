// Km/h to m/s Converter 

import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for speed in km/h
        System.out.println("Enter speed in km/h:");
        double kmh = scanner.nextDouble();

        // Convert km/h to m/s
        double ms = kmh / 3.6;

        // Display result in m/s
        System.out.println("Speed in m/s: " + ms);
    }
}

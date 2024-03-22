//Read an integer value in seconds, and print it in hours, minutes, and seconds.

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for enter the number of seconds
        System.out.println("Enter seconds for convert: ");
        int totalSeconds = input.nextInt();

        // Define constants for easier understanding
        final int SECONDS_FOR_HOUR = 3600; // 1 hour = 3600 seconds
        final int SECONDS_FOR_MINUTES = 60; // 1 minute = 60 seconds

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / SECONDS_FOR_HOUR;
        int minutes = (totalSeconds % SECONDS_FOR_HOUR) / SECONDS_FOR_MINUTES;
        int remainingSeconds = (totalSeconds % SECONDS_FOR_HOUR) % SECONDS_FOR_MINUTES;

        System.out.printf("%d in time is %d:%02d:%02d", totalSeconds, hours, minutes, remainingSeconds);
    }
}



import java.util.ArrayList;
import java.util.Collections;

public class Exercise_2 {

    /**
     * Finds the first n numbers that are multiples of i or j.
     *
     * @param n number of terms to be found
     * @param i first number to check for multiples
     * @param j second number to check for multiples
     * @return ArrayList containing the first n multiples of i or j
     */
    public static ArrayList<Integer> findMultiples(int n, int i, int j) {
        ArrayList<Integer> multiples = new ArrayList<>();
        int num = 0;

        // Loop until the desired number of multiples is found
        while (multiples.size() < n) {
            // Check if the number is a multiple of i or j
            if (num % i == 0 || num % j == 0) {
                multiples.add(num);
            }
            num++;
        }
        return multiples;
    }

    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int n = 6;

        try {
            // Find the first n multiples of i or j
            ArrayList<Integer> multiples = findMultiples(n, i, j);

            // Sort the multiples
            Collections.sort(multiples);

            // Print the multiples
            for (int num : multiples) {
                System.out.printf("%d ", num);
            }
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Error executing the program: " + e.getMessage());
        }
    }
}
import java.util.Scanner;

/**
 * Library Fine Calculator:
 * - Accepts the number of days a book is overdue.
 * - Calculates the fine based on the following rules:
 * • $0.50 per day for the first 7 days.
 * • $1.00 per day for the next 7 days.
 * • $5.00 per day after 14 days.
 * - Prints the total fine.
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input.
        System.out.println("How many days overdue?");

        // Read the number of days overdue from the user.
        int days = scanner.nextInt();

        // Call the fineCalculator method and capture the result.
        double totalFine = fineCalculator(days);

        // Print the total fine to the console.
        System.out.println("Total fine: $" + totalFine);

        scanner.close();     // Close the scanner to release resources.
    }

    // Method to calculate the total fine based on the number of overdue days.
    public static double fineCalculator(int daysOverdue) {
        double totalFine = 0; // Initialize the total fine to zero.

        // Loop through each overdue day.
        for (int i = 1; i <= daysOverdue; i++) {
            if (i <= 7) {
                // First 7 days: $0.50 per day.
                totalFine += 0.50;
            } else if (i <= 14) {
                // Days 8 to 14: $1.00 per day.
                totalFine += 1.00;
            } else {
                // After 14 days: $5.00 per day.
                totalFine += 5.00;
            }
        }

        // Return the calculated total fine.
        return totalFine;
    }
}

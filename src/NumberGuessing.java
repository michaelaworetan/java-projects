import java.util.Scanner;
/**
 * Create a program that:
 *   Randomly selects a number between 1 and 50.
 *   Allows the user to guess the number (max 5 attempts).
 *   Gives feedback if the guess is too high or too low.
 *   Ends the game if the number is guessed correctly or attempts run out.
 */

public class NumberGuessing {
    public static void main(String[] args) {
        // Generate a random number between 1 and 50 using inbuilt Math.random function
        int randomNumber = (int) (Math.random() * 50) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Try to guess the number (between 1 and 50). You have 5 attempts!");

        // for loop to allow for 5 trials
        for (int i = 1; i <= 5; i++) {
            System.out.print("Guess number " + i + ": ");
            int guess = scanner.nextInt();

            // Validate if the guess is within the range
            if (guess < 1 || guess > 50) {
                System.out.println("Invalid input! Please enter a number between 1 and 50.");
                i--; // Allow the user to reattempt without losing an attempt
                continue;
            }

            // Check if the guess is correct
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                scanner.close(); // Close the scanner
                return;
            }

            // Provide feedback if the guess is too high or too low
            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        // Inform the user that they ran out of attempts
        System.out.println("Game over! You've used all 5 attempts. The correct number was: " + randomNumber);
        scanner.close(); // Close the scanner
    }
}

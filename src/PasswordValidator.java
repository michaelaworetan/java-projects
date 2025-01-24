import java.util.Scanner;
/**
 * Create a program that:
 *  Accepts a password from the user.
 *  Validates it based on these rules: At least 8 characters long.
 *  Contains at least one uppercase letter, one lowercase letter, and one number. Displays whether the password is valid or not.
 *  Display WHY it is invalid (“password too short”, “no upper case character”, etc.)
 * */


public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Please enter your password");

        int attempts = 0; // Counter for attempts
        final int maxAttempts = 5; // Maximum number of retries

        // while loop to allow for retries
        while (attempts < maxAttempts) {
            System.out.println("\nAttempt " + (attempts + 1) + " of " + maxAttempts + ": Enter a password:");
            String password = scanner.nextLine();

            // Validate the password and display feedback
            String result = validatePassword(password);
            if (result.equals("Password is valid!")) { // check for the return value
                System.out.println(result);
                System.out.println("Password accepted. Thank you!");
                break; // Exit loop as the password is valid
            } else {
                System.out.println(result); // Display why the password is invalid
                attempts++;
            }

            // Check if max attempts have been reached
            if (attempts == maxAttempts) {
                System.out.println("Maximum attempts reached. Please try again later.");
            }
        }

        scanner.close(); // Close the scanner after the loop
    }

    /**
     * validatePassword function
     * Returns a message indicating whether the password is valid or why it is invalid
     */
    public static String validatePassword(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;

        // Check length
        if (password.length() < 8) {
            return "Password too short. It must be at least 8 characters long.";
        }

        // Check for required characters
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        // Provide feedback based on missing conditions
        if (!hasUppercase) {
            return "Password must contain at least one uppercase letter.";
        }
        if (!hasLowercase) {
            return "Password must contain at least one lowercase letter.";
        }
        if (!hasNumber) {
            return "Password must contain at least one number.";
        }

        // If all conditions are met
        return "Password is valid!";
    }
}

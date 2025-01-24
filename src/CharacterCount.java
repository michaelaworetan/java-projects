
import java.util.Scanner;
/**
 * Create a function that takes two parameters, a string and a character, and returns
 * the number of times the character appears in the string. Use this function in your
 * main program to display the count for a user-inputted string and character.
 */

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user for a character
        System.out.println("Enter a character: ");
        char inputChar = scanner.next().charAt(0);  // Getting the first character from the user input

        // Call the function to count occurrences of the character
        int count = countCharacterOccurrences(inputString, inputChar);

        // Display the result
        System.out.println("The character '" + inputChar + "' appears " + count + " times in the string.");

        scanner.close();
    }

    // Function to count occurrences of a character in a string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // If the character matches, increment the count
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;  // Return the total count of occurrences
    }
}

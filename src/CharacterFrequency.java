import java.util.Scanner;

public class CharacterFrequency {
    // Method to count frequency of characters in a string
    public static void countCharacterFrequency(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
//        System.out.println(chars);

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < chars.length; i++) {
            // Skip if the character is already counted
            if (chars[i] == '\0') {
                continue;
            }

            // Initialize count for the current character
            int count = 1;

            // Count the occurrences of the current character in the string
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '\0'; // Mark the character as counted by replacing it with a null character
                }
            }

            // Print the frequency of the current character
            System.out.println(chars[i] + " : " + count);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count character frequencies
        countCharacterFrequency(input);

        // Close the scanner object
        scanner.close();
    }
}

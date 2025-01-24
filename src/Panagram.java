import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Your task is to figure out if a sentence is a pangram.
 * A pangram is a sentence using every letter of the alphabet at least once. It is case-insensitive.
 */
public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();

        if (isPanagram(sentence)) {
            System.out.println("The sentence is a pangram!");

        } else {
            System.out.println("Sentence is not a pangram!!");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Checks if a string is a pangram.
     * string: The input string to check.
     * return true if the string contains all 26 letters of the English alphabet; false otherwise.
     */
    public static boolean isPanagram(String str) {
        // Convert to lowercase and remove leading/trailing spaces
        String newStr = str.toLowerCase().trim();

        // Create a set to track unique letters
        Set<Character> letterSet = new HashSet<>();

        // Iterate over each character in the string

        // The toCharArray() is a String method in Java is a member of the String class,
        //  and its purpose is to convert a string
        //  into an array of characters

        for (char c : newStr.toCharArray()) {
            //   System.out.println(c);
            if (Character.isLetter(c)) {
                letterSet.add(c); // Add only letters to the set
            }
        }

        // Check if the set contains all 26 letters
        return letterSet.size() == 26;
    }
}

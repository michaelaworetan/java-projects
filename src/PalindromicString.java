/**
 * Check Palindromic String: Check if a given string is a palindrome.
 * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward,
 * ignoring spaces, punctuation, and capitalization.
 */

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // normalize the string by removing spaces and converting it to lowercase
        String newStr = str.replaceAll("\\s+", "").toLowerCase(); // remove spaces and convert to lowercase

        // Reverse the string
        // StringBuilder class allows you to modify the string without creating a new object each time
        String reversedStr = new StringBuilder(newStr).reverse().toString();

        // Compare original and reversed strings using the(.equals) String method
        return newStr.equals(reversedStr);
    }
}



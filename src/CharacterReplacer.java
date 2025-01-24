import java.util.Scanner;

public class CharacterReplacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the string input from the user
        System.out.print("Enter the original string: ");
        String inputString = scanner.nextLine();

        // Get the character to be replaced
        System.out.print("Enter the character to be replaced: ");
        char toBeReplacedChar = scanner.next().charAt(0);

        // Get the replacement character
        System.out.print("Enter the replacement character: ");
        char CharReplacement = scanner.next().charAt(0);

        // Call the replaceCharacter function and display the result
        String modifiedString = replaceCharacter(inputString, toBeReplacedChar, CharReplacement);
        System.out.println("Modified string: " + modifiedString);

        scanner.close();  //close resource
    }


    // method to replace the Character
    public static String replaceCharacter(String inputString, char toReplaceChar, char CharReplacement) {
        // Replace all occurrences of 'toReplace' with 'replacement' in the input string

        return inputString.replace(toReplaceChar, CharReplacement);   // using the String inbuilt replace character method
    }
}


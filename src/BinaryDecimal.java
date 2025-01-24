import java.util.Scanner;

public class BinaryDecimal {
    //    Binary to Decimal: Convert a binary number (input as a string) to a decimal number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // collect user input
        System.out.print("Enter a Binary Number: ");
        String binaryStr = scanner.nextLine();

        // Convert binary string to decimal number using java's inbuilt Integer.parseTnt method
        int decimalNumber = Integer.parseInt(binaryStr, 2);

        // decimal equivalent
        System.out.println("Decimal equivalent: " + decimalNumber);

        scanner.close();

    }
}

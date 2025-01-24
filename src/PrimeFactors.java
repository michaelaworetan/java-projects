import java.util.Scanner;

public class PrimeFactors {
    // This method checks if a number is prime.
    public static boolean isPrime(int n) {
        // A number less than 2 is not prime
        if (n <= 1) return false;

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i * i <= n; i++) {  // only need to check up to sqrt(n)
            if (n % i == 0) {  // If n is divisible by i, it's not prime
                return false;
            }
        }

        // If no factors found, then it's prime
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input number
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        // Loop through all possible factors starting from 2 to the number itself
        for (int i = 2; i <= num; i++) {
            // If i divides num and i is prime, it's a prime factor
            while (num % i == 0 && isPrime(i)) {
                System.out.println(i);  // Print prime factor
                num /= i;  // Divide num by i to continue finding further prime factors
            }
        }

        // Close the scanner object
        scanner.close();
    }
}

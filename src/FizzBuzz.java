public class FizzBuzz {
    public static void main(String[] args) {
        // FizzBuzz: Print numbers from 1 to 100, replacing multiples of 3 with "Fizz,"
        // multiples of 5 with "Buzz," and multiples of both with "FizzBuzz."
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // Check for multiples of both 3 and 5 first
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Check for multiples of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Check for multiples of 5
                System.out.println("Buzz");
                /* Otherwise, print the number */
            } else System.out.println(i);
        }
    }
}

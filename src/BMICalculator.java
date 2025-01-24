import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userChoice = "yes";  // Variable to control the loop yes continues the loop, while no exits the loop

        // while loop to continue prompts
        while (userChoice.equalsIgnoreCase("yes")) {
            // Prompt user for weight and height
            System.out.println("Enter your weight in kilograms (kg): ");
            double weight = scanner.nextDouble();

            System.out.println("Enter your height in meters (m): ");
            double height = scanner.nextDouble();

            // Calculate BMI
            double bmi = calcBMI(weight, height);

            // Display BMI and corresponding health category
            System.out.println("Your BMI is: " + bmi);
            System.out.println("Your BMI categoty: " + getBMICategory(bmi));

            // Ask the user if they want to perform another calculation
            System.out.println("Do you want to calculate another BMI? (yes/no)");
            userChoice = scanner.next(); // User input for repeating
        }

        System.out.println("Thank you for using the BMI calculator. Goodbye!");
        scanner.close();
    }

    // Method to calculate BMI
    public static double calcBMI(double weight, double height) {
        return weight / (height * height); // BMI formula
    }

    // Method to return the BMI category based on the calculated BMI
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight, Go get some food!!";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight, Good to go!! ";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight!, Make the Gym";
        } else if (bmi >= 30.0 && bmi <= 34.9) {
            return "Obesity (Class I)!, Health at Risk!!";
        } else if (bmi >= 35.0 && bmi <= 39.9) {
            return "Obesity (Class II)!, Health at Risk!!";
        } else {
            return "Extreme Obesity (Class III)";
        }
    }
}

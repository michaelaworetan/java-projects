import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {  // wrapping the game in a loop for retries if there is a tie
            String player1Choice, player2Choice; // declaring to variables inline

            // Loop to ensure Player 1 enters a valid choice
            while (true) {
                System.out.println("Player 1, enter your choice (rock, paper, scissors):");
                player1Choice = scanner.nextLine().toLowerCase();  // convert choice to lowercase
                if (isValidChoice(player1Choice)) {
                    break; // Exit the loop if the input is valid
                }
                System.out.println("Invalid input! Please enter 'rock', 'paper', or 'scissors'.");
            }

            // Loop to ensure Player 2 enters a valid choice
            while (true) {
                System.out.println("Player 2, enter your choice (rock, paper, scissors):");
                player2Choice = scanner.nextLine().toLowerCase();
                if (isValidChoice(player2Choice)) {
                    break; // Exit the loop if the input is valid
                }
                System.out.println("Invalid input! Please enter 'rock', 'paper', or 'scissors'.");
            }

            // Call the game simulator function
            String result = simulateGame(player1Choice, player2Choice);

            // If there's a tie, restart the game
            if (result.equals("TIE")) {
                System.out.println("It's a TIE! Play again.");
                continue; // Restart the loop for another round
            }

            // Print the result and exit the loop if there's a winner
            System.out.println(result);
            break;
        }

        scanner.close(); // Close the scanner to release resources
    }

    /**
     * Helper function to help Validates if the player's choice is valid.
     * return true if the choice is valid or false  otherwise
     */
    public static boolean isValidChoice(String choice) {
        //.equals is a method of Class String(used to compare the content of two String objects for equality)
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    /**
     * Simulates the "Rock, Paper, Scissors" game
     * player1 - Choice of player 1 ("rock", "paper", "scissors")
     * player2 - Choice of player 2 ("rock", "paper", "scissors")
     * Result of the game: "Player 1 wins", "Player 2 wins", or "TIE"
     */
    public static String simulateGame(String player1, String player2) {
        // Check if both players made the same choice (TIE)
        if (player1.equals(player2)) {
            return "TIE";
        }

        // Determine the winner based on the rules
        if ((player1.equals("rock") && player2.equals("scissors")) ||
                (player1.equals("paper") && player2.equals("rock")) ||
                (player1.equals("scissors") && player2.equals("paper"))) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }
    }
}
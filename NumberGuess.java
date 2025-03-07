import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    private static Random random = new Random();

    public static void main(String[] args) {
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        String feedback = ""; // Declare feedback outside the loop
        Scanner scanner = new Scanner(System.in);

        do {
            guess = generateGuess();
            System.out.println("Computer guesses: " + guess);
            feedback = getUserFeedback(scanner); // Update feedback here
            if (feedback.equals("correct")) {
                System.out.println("Computer guessed the number!");
            }
        } while (!feedback.equals("correct"));

        scanner.close();
    }

    private static int generateGuess() {
        return random.nextInt(100) + 1; // Generate a random guess between 1 and 100
    }

    private static String getUserFeedback(Scanner scanner) {
        System.out.print("Is the guess high, low, or correct? ");
        return scanner.nextLine().toLowerCase(); // Get user feedback
    }
}


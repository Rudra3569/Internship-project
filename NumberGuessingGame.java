import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game! Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low. Try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high. Try again!");
            }
        } while (userGuess != randomNumber);

        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");

        scanner.close();
    }
}
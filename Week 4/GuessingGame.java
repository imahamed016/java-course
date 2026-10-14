// This program demonstrates the while loop using a number guessing game.
// The loop continues until the user guesses the correct number.

// Import the Scanner class for user input.
import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {

// Create a Scanner object to read input from the keyboard.
Scanner scanner = new Scanner(System.in);

// Generate a random number between 1 and 100.
// Math.random() returns a double between 0.0 and 1.0.
// Multiplying by 100 gives 0.0 to 99.999...
// Casting to int gives 0 to 99.
// Adding 1 gives 1 to 100.
int secretNumber = (int) (Math.random() * 100) + 1;

// Declare a variable to store the user's guess.
// Initialize to 0 so the loop condition is initially true.



int guess = 0;

// Declare a counter to track the number of attempts.
int attempts = 0;

// Display welcome message.
System.out.println("========================================");
System.out.println(" NUMBER GUESSING GAME");
System.out.println("========================================");
System.out.println("I'm thinking of a number between 1 and 100.");
System.out.println("Can you guess it?\n");

// ============================================================
// WHILE LOOP: Continue until the guess matches the secret number.
// ============================================================
// The loop condition is checked BEFORE each iteration.
// As long as guess != secretNumber, the loop body executes.
// ============================================================

while (guess != secretNumber) {

// Increment the attempt counter.
attempts++;

// Prompt the user to enter a guess.
System.out.print("Attempt " + attempts + " - Enter your guess: ");



// Read the user's guess.
guess = scanner.nextInt();

// ============================================================
// SELECTION CONTROL: Provide feedback based on the guess.
// ============================================================

// Check if the guess is too low.
if (guess < secretNumber) {
System.out.println("Too low! Try again.\n");
}
// Check if the guess is too high.
else if (guess > secretNumber) {
System.out.println("Too high! Try again.\n");
}
// If neither too low nor too high, the guess must be correct.
else {
System.out.println("\n Congratulations! You guessed it!");
System.out.println("The number was: " + secretNumber);
System.out.println("You took " + attempts + " attempt(s).");
}
}

// Close the scanner to free resources.
scanner.close();



}
}
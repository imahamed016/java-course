// This program demonstrates user input using the Scanner class.
// It creates an interactive calculator that performs basic operations.

// Import the Scanner class from the java.util package.
import java.util.Scanner;

public class InteractiveCalculator {
public static void main(String[] args) {

// Create a Scanner object to read input from the keyboard.
// System.in represents the standard input stream (keyboard).
Scanner scanner = new Scanner(System.in);

// ============================================================
// WELCOME MESSAGE
// ============================================================



System.out.println("========================================");
System.out.println(" INTERACTIVE CALCULATOR");
System.out.println("========================================");

// ============================================================
// READ USER'S NAME
// ============================================================

// Prompt the user for their name.
System.out.print("Enter your name: ");

// nextLine() reads the entire line including spaces.
String name = scanner.nextLine();

// Greet the user.
System.out.println("\nHello, " + name + "! Let's do some calculations.\n");

// ============================================================
// READ FIRST NUMBER
// ============================================================

System.out.print("Enter first number: ");

// nextDouble() reads a decimal number from the user.
double num1 = scanner.nextDouble();



// ============================================================
// READ SECOND NUMBER
// ============================================================

System.out.print("Enter second number: ");

// Read the second number.
double num2 = scanner.nextDouble();

// ============================================================
// PERFORM CALCULATIONS
// ============================================================

// Addition
double sum = num1 + num2;

// Subtraction
double difference = num1 - num2;

// Multiplication
double product = num1 * num2;

// Division - check for division by zero
double quotient = 0;
boolean divisionValid = false;



if (num2 != 0) {
quotient = num1 / num2;
divisionValid = true;
}

// Modulus - only for integers
int intNum1 = (int) num1;
int intNum2 = (int) num2;
int remainder = 0;
boolean modulusValid = false;

if (intNum2 != 0) {
remainder = intNum1 % intNum2;
modulusValid = true;
}

// ============================================================
// DISPLAY RESULTS
// ============================================================

System.out.println("\n========================================");
System.out.println(" RESULTS FOR " + name.toUpperCase());
System.out.println("========================================");
System.out.println("First Number: " + num1);
System.out.println("Second Number: " + num2);
System.out.println("----------------------------------------");



System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

// Display division result only if valid.
if (divisionValid) {
System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
} else {
System.out.println("Division: Cannot divide by zero!");
}

// Display modulus result only if valid.
if (modulusValid) {
System.out.println("Modulus: " + intNum1 + " % " + intNum2 + " = " + remainder);
} else {
System.out.println("Modulus: Cannot divide by zero!");
}

System.out.println("========================================");

// ============================================================
// ADDITIONAL CALCULATIONS
// ============================================================

// Calculate the average of the two numbers.
double average = (num1 + num2) / 2;


// Calculate the square of the first number.
double square = num1 * num1;

System.out.println("\n=== ADDITIONAL CALCULATIONS ===");
System.out.println("Average of " + num1 + " and " + num2 + " = " + average);
System.out.println("Square of " + num1 + " = " + square);

// ============================================================
// CLOSE THE SCANNER
// ============================================================

// Always close the Scanner to free up resources.
scanner.close();

System.out.println("\nThank you for using the calculator, " + name + "!");
}
}
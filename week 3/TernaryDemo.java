// This program demonstrates the ternary operator as a shorthand for if-else.

public class TernaryDemo {
public static void main(String[] args) {

// Declare an integer variable for age.
int age = 20;

// Using if-else (traditional way)




String eligibilityIfElse;
if (age >= 18) {
eligibilityIfElse = "Eligible to vote";
} else {
eligibilityIfElse = "Not eligible to vote";
}
System.out.println("Using if-else: " + eligibilityIfElse);

// Using ternary operator (shorthand)
// Syntax: condition ? valueIfTrue : valueIfFalse
String eligibilityTernary = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
System.out.println("Using ternary: " + eligibilityTernary);

// Another example: check if a number is even or odd.
int number = 7;
String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
System.out.println(number + " is " + evenOdd);
}
}
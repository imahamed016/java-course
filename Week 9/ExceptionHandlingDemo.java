// This program demonstrates Exception Handling using try-catch-finally blocks.

public class ExceptionHandlingDemo {
public static void main(String[] args) {



// ============================================================
// EXAMPLE 1: ArithmeticException (Unchecked)
// ============================================================
System.out.println("=== EXAMPLE 1: Division by Zero ===");

int numerator = 10;
int denominator = 0;

try {
// The code inside 'try' is monitored for errors.
int result = numerator / denominator;
System.out.println("Result: " + result); // This will NOT print
}
catch (ArithmeticException e) {
// If an ArithmeticException occurs in the try block,
// the program jumps here. The program does NOT crash.
System.out.println("Error caught: You cannot divide by zero!");
// getMessage() prints the specific error from Java.
System.out.println("Java says: " + e.getMessage());
}
finally {
// The 'finally' block ALWAYS executes, whether an exception occurred or not.
System.out.println("Finally block executed (cleaning up resources).");
}

System.out.println("Program continues safely...\n");



// ============================================================
// EXAMPLE 2: ArrayIndexOutOfBoundsException (Unchecked)
// ============================================================
System.out.println("=== EXAMPLE 2: Array Out of Bounds ===");

int[] numbers = {1, 2, 3};

try {
// Trying to access index 5, but the array only goes up to index 2.
System.out.println(numbers[5]);
}
catch (ArrayIndexOutOfBoundsException e) {
// Catch the specific error.
System.out.println("Error caught: The array index is out of bounds!");
}

System.out.println("Program continues safely...\n");

// ============================================================
// EXAMPLE 3: Finally Block in a Method
// ============================================================
System.out.println("=== EXAMPLE 3: Method with Exception Propagation ===");
performRiskyOperation();

System.out.println("Program finished.");



}

// A method that handles its own exception.
public static void performRiskyOperation() {
try {
// Convert a String to an Integer.
String text = "abc";
int number = Integer.parseInt(text); // This throws NumberFormatException
System.out.println(number);
}
catch (NumberFormatException e) {
// Catch the error.
System.out.println("Error caught: Invalid number format.");
}
}
}
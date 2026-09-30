// This program checks if a number is positive, negative, or zero.

public class PositiveNegativeZero {
public static void main(String[] args) {

// Declare an integer variable named number and assign it the value 10.
int number = 10;

// Check if the number is greater than 0.
if (number > 0) {
// If true, print that the number is positive.
System.out.println(number + " is positive.");
}
// If the first condition is false, check if the number is less than 0.
else if (number < 0) {
// If true, print that the number is negative.
System.out.println(number + " is negative.");
}
// If both conditions are false, the number must be zero.



else {
// Print that the number is zero.
System.out.println(number + " is zero.");
}
}
}
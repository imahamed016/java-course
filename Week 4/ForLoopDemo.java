// This program demonstrates the for loop with various examples.
// The for loop is ideal when the number of iterations is known.

public class ForLoopDemo {
public static void main(String[] args) {

// ============================================================
// EXAMPLE 1: Basic for loop - print numbers 1 to 5
// ============================================================

System.out.println("=== EXAMPLE 1: Numbers 1 to 5 ===");

// for (initialization; condition; update)
// initialization: int i = 1 (runs once)
// condition: i <= 5 (checked before each iteration)



// update: i++ (runs after each iteration)
for (int i = 1; i <= 5; i++) {
System.out.println("Number: " + i);
}

// ============================================================
// EXAMPLE 2: Sum of numbers 1 to 100
// ============================================================

System.out.println("\n=== EXAMPLE 2: Sum of 1 to 100 ===");

// Declare a variable to hold the sum.
int sum = 0;

// Loop from 1 to 100.
for (int i = 1; i <= 100; i++) {
// Add the current number to the sum.
sum += i;
}

// Print the total sum.
System.out.println("Sum of numbers 1 to 100 = " + sum);

// ============================================================
// EXAMPLE 3: Countdown from 10 to 1
// ============================================================


System.out.println("\n=== EXAMPLE 3: Countdown ===");

// Loop from 10 down to 1 (decrement).
for (int i = 10; i >= 1; i--) {
System.out.print(i + " ");
}
System.out.println("Blast off! ");

// ============================================================
// EXAMPLE 4: Print even numbers from 2 to 20
// ============================================================

System.out.println("\n=== EXAMPLE 4: Even Numbers 2 to 20 ===");

// Loop from 2 to 20, incrementing by 2.
for (int i = 2; i <= 20; i += 2) {
System.out.print(i + " ");
}
System.out.println();

// ============================================================
// EXAMPLE 5: Multiplication table for 7
// ============================================================

System.out.println("\n=== EXAMPLE 5: Multiplication Table for 7 ===");



// Loop from 1 to 10.
for (int i = 1; i <= 10; i++) {
// Print the multiplication result.
System.out.println("7 x " + i + " = " + (7 * i));
}

// ============================================================
// EXAMPLE 6: Enhanced for loop (for-each) with an array
// ============================================================

System.out.println("\n=== EXAMPLE 6: Enhanced for Loop ===");

// Declare and initialize an array of names.
String[] students = {"Alice", "Bob", "Charlie", "Diana"};

// Enhanced for loop: for (Type variable : collection)
// Reads as: "for each student in students"
for (String student : students) {
System.out.println("Student: " + student);
}
}
}
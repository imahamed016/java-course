// This program demonstrates nested loops by generating various patterns.

// Import Scanner for user input.
import java.util.Scanner;

public class PatternGenerator {


public static void main(String[] args) {

// Create a Scanner object.
Scanner scanner = new Scanner(System.in);

// Ask the user for the number of rows.
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();

// ============================================================
// PATTERN 1: Right Triangle (Increasing Stars)
// ============================================================

System.out.println("\n=== PATTERN 1: Right Triangle ===");

// Outer loop controls the number of rows.
for (int i = 1; i <= rows; i++) {

// Inner loop prints stars for the current row.
// For row i, it prints i stars.
for (int j = 1; j <= i; j++) {
System.out.print("*");
}

// Move to the next line after printing stars for this row.
System.out.println();



}

// ============================================================
// PATTERN 2: Inverted Right Triangle (Decreasing Stars)
// ============================================================

System.out.println("\n=== PATTERN 2: Inverted Right Triangle ===");

// Outer loop counts down from rows to 1.
for (int i = rows; i >= 1; i--) {

// Inner loop prints stars for the current row.
// For row i, it prints i stars.
for (int j = 1; j <= i; j++) {
System.out.print("*");
}

// Move to the next line.
System.out.println();
}

// ============================================================
// PATTERN 3: Pyramid (Centered Stars)
// ============================================================

System.out.println("\n=== PATTERN 3: Pyramid ===");


// Outer loop controls the number of rows.
for (int i = 1; i <= rows; i++) {

// First inner loop: print spaces for alignment.
// Number of spaces = rows - i
for (int j = 1; j <= rows - i; j++) {
System.out.print(" ");
}

// Second inner loop: print stars.
// Number of stars = 2 * i - 1
for (int k = 1; k <= 2 * i - 1; k++) {
System.out.print("*");
}

// Move to the next line.
System.out.println();
}

// ============================================================
// PATTERN 4: Number Triangle
// ============================================================

System.out.println("\n=== PATTERN 4: Number Triangle ===");


// Outer loop controls the number of rows.
for (int i = 1; i <= rows; i++) {

// Inner loop prints numbers from 1 to i.
for (int j = 1; j <= i; j++) {
// Print the current number followed by a space.
System.out.print(j + " ");
}

// Move to the next line.
System.out.println();
}

// ============================================================
// PATTERN 5: Multiplication Table
// ============================================================

System.out.println("\n=== PATTERN 5: Multiplication Table ===");

// Print header row.
System.out.print(" ");
for (int i = 1; i <= rows; i++) {
// Print column headers with formatting.
System.out.printf("%4d", i);
}
System.out.println();



// Print separator line.
System.out.print(" ");
for (int i = 1; i <= rows; i++) {
System.out.print("----");
}
System.out.println();

// Outer loop for each row.
for (int i = 1; i <= rows; i++) {
// Print row header.
System.out.printf("%3d|", i);

// Inner loop for each column.
for (int j = 1; j <= rows; j++) {
// Print the product with formatting.
System.out.printf("%4d", i * j);
}

// Move to the next line.
System.out.println();
}

// Close the scanner.
scanner.close();
}



}
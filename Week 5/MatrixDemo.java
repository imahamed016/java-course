// This program demonstrates two-dimensional (2D) arrays in Java.
// 2D arrays are useful for tables, grids, and matrices.

public class MatrixDemo {
public static void main(String[ ] args) {

// ============================================================
// SECTION 1: DECLARING AND INITIALIZING A 2D ARRAY
// ============================================================

// Method 1: Using curly braces to initialize a 2D array.
// Each inner curly brace represents a row.
int[][] matrix = {
{1, 2, 3}, // Row 0
{4, 5, 6}, // Row 1
{7, 8, 9} // Row 2
};


// Method 2: Declaring with size and assigning later.
// int[][] table = new int[3][4]; // 3 rows, 4 columns

// ============================================================
// SECTION 2: ACCESSING ELEMENTS
// ============================================================

System.out.println("=== ACCESSING ELEMENTS ===");

// Access element at row 0, column 0.
System.out.println("matrix[0][0] = " + matrix[0][0]); // 1

// Access element at row 1, column 2.
System.out.println("matrix[1][2] = " + matrix[1][2]); // 6

// Access element at row 2, column 1.
System.out.println("matrix[2][1] = " + matrix[2][1]); // 8

// Number of rows = matrix.length
System.out.println("Number of rows: " + matrix.length);

// Number of columns in row 0 = matrix[0].length
System.out.println("Number of columns in row 0: " + matrix[0].length);

// ============================================================
// SECTION 3: PRINTING THE MATRIX WITH NESTED LOOPS



// ============================================================

System.out.println("\n=== PRINTING THE MATRIX ===");

// Outer loop iterates through rows.
for (int i = 0; i < matrix.length; i++) {

// Inner loop iterates through columns of row i.
for (int j = 0; j < matrix[i].length; j++) {
// Print each element with spacing.
System.out.print(matrix[i][j] + " ");
}

// Move to the next line after printing a row.
System.out.println();
}

// ============================================================
// SECTION 4: ENHANCED FOR LOOP WITH 2D ARRAYS
// ============================================================

System.out.println("\n=== ENHANCED FOR LOOP ===");

// Outer for-each iterates through each row (which is an int[]).
for (int[ ] row : matrix) {
// Inner for-each iterates through each element in the row.



for (int value : row) {
System.out.print(value + "\t");
}
System.out.println();
}

// ============================================================
// SECTION 5: SUMMING ELEMENTS IN A 2D ARRAY
// ============================================================

System.out.println("\n=== SUM OF ALL ELEMENTS ===");

// Variable to hold the total sum.
int totalSum = 0;

// Outer loop through rows.
for (int i = 0; i < matrix.length; i++) {
// Inner loop through columns.
for (int j = 0; j < matrix[i].length; j++) {
// Add each element to the sum.
totalSum += matrix[i][j];
}
}

System.out.println("Sum of all elements: " + totalSum);



// ============================================================
// SECTION 6: ROW SUMS AND COLUMN SUMS
// ============================================================

System.out.println("\n=== ROW SUMS ===");

// Loop through each row.
for (int i = 0; i < matrix.length; i++) {
// Variable to hold the sum of this row.
int rowSum = 0;

// Loop through each column in this row.
for (int j = 0; j < matrix[i].length; j++) {
rowSum += matrix[i][j];
}

System.out.println("Sum of row " + i + ": " + rowSum);
}

System.out.println("\n=== COLUMN SUMS ===");

// Assume all rows have the same length.
int columns = matrix[0].length;

// Loop through each column.
for (int j = 0; j < columns; j++) {


// Variable to hold the sum of this column.
int colSum = 0;

// Loop through each row in this column.
for (int i = 0; i < matrix.length; i++) {
colSum += matrix[i][j];
}

System.out.println("Sum of column " + j + ": " + colSum);
}

// ============================================================
// SECTION 7: REAL-WORLD EXAMPLE – STUDENT MARKS TABLE
// ============================================================

System.out.println("\n=== STUDENT MARKS TABLE ===");

// 2D array with student marks: rows = students, columns = subjects.
int[ ][ ] studentMarks = {
{85, 90, 78}, // Alice: Math, English, Science
{72, 88, 91}, // Bob
{65, 75, 80} // Charlie
};

String[ ] studentNames = {"Alice", "Bob", "Charlie"};
String[ ] subjects = {"Math", "English", "Science"};



// Print table header.
System.out.print("Student ");
for (String subject : subjects) {
System.out.print(subject + " ");
}
System.out.println("Average");
System.out.println("-------------------------------------------");

// Loop through each student.
for (int i = 0; i < studentMarks.length; i++) {
// Print student name.
System.out.print(studentNames[i] + " ");

// Variable for total marks.
int total = 0;

// Print each mark and accumulate total.
for (int j = 0; j < studentMarks[i].length; j++) {
System.out.print(studentMarks[i][j] + " ");
total += studentMarks[i][j];
}

// Calculate and print the average.
double avg = (double) total / studentMarks[i].length;
System.out.printf("%.2f%n", avg);



}
}
}
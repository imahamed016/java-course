// This program demonstrates common array algorithms:
// - Finding the maximum value
// - Finding the minimum value
// - Calculating the average
// - Linear search

public class ArrayAlgorithms {



public static void main(String[] args) {

// Declare and initialize an array of marks.
int[] marks = {65, 72, 48, 91, 57, 83, 69, 75, 52, 88};

// Print the array for reference.
System.out.print("Marks: ");
for (int mark : marks) {
System.out.print(mark + " ");
}
System.out.println("\n");

// ============================================================
// ALGORITHM 1: FIND THE MAXIMUM VALUE (O(n))
// ============================================================

System.out.println("=== FIND MAXIMUM ===");

// Assume the first element is the maximum.
int max = marks[0];

// Iteration counter to analyze efficiency.
int maxIterations = 0;

// Loop through all elements.
for (int i = 0; i < marks.length; i++) {



// Increment the iteration counter.
maxIterations++;

// If the current element is greater than max, update max.
if (marks[i] > max) {
max = marks[i];
}
}

System.out.println("Maximum mark: " + max);
System.out.println("Iterations: " + maxIterations);
System.out.println("Time Complexity: O(n)");

// ============================================================
// ALGORITHM 2: FIND THE MINIMUM VALUE (O(n))
// ============================================================

System.out.println("\n=== FIND MINIMUM ===");

// Assume the first element is the minimum.
int min = marks[0];

// Iteration counter.
int minIterations = 0;

// Loop through all elements.



for (int i = 0; i < marks.length; i++) {
minIterations++;
// If the current element is less than min, update min.
if (marks[i] < min) {
min = marks[i];
}
}

System.out.println("Minimum mark: " + min);
System.out.println("Iterations: " + minIterations);
System.out.println("Time Complexity: O(n)");

// ============================================================
// ALGORITHM 3: CALCULATE THE AVERAGE (O(n))
// ============================================================

System.out.println("\n=== CALCULATE AVERAGE ===");

// Variable to hold the sum of all marks.
int sum = 0;

// Loop through the array and add each element to sum.
for (int i = 0; i < marks.length; i++) {
sum += marks[i];
}



// Calculate the average as a double.
double average = (double) sum / marks.length;

System.out.println("Sum: " + sum);
System.out.println("Number of marks: " + marks.length);
System.out.printf("Average: %.2f%n", average);
System.out.println("Time Complexity: O(n)");

// ============================================================
// ALGORITHM 4: LINEAR SEARCH (O(n))
// ============================================================

System.out.println("\n=== LINEAR SEARCH ===");

// The value we are looking for.
int target = 83;

// Variable to store the position (index). -1 means not found.
int foundIndex = -1;

// Iteration counter.
int searchIterations = 0;

// Loop through the array looking for the target.
for (int i = 0; i < marks.length; i++) {
searchIterations++;



if (marks[i] == target) {
foundIndex = i;
break; // Exit loop once found (early exit optimization)
}
}

// Report the result.
if (foundIndex != -1) {
System.out.println("Found " + target + " at index " + foundIndex);
} else {
System.out.println(target + " not found in the array.");
}

System.out.println("Iterations: " + searchIterations);
System.out.println("Time Complexity: O(n) - best case O(1), worst case O(n)");

// ============================================================
// ALGORITHM 5: COUNT ELEMENTS ABOVE THRESHOLD (O(n))
// ============================================================

System.out.println("\n=== COUNT ABOVE THRESHOLD ===");

// Threshold value (pass mark).
int threshold = 70;

// Counter for elements above threshold.



int count = 0;

// Loop through the array.
for (int mark : marks) {
// Increment count if the mark is >= threshold.
if (mark >= threshold) {
count++;
}
}

System.out.println("Marks above or equal to " + threshold + ": " + count);
System.out.println("Total marks: " + marks.length);
System.out.println("Time Complexity: O(n)");

// ============================================================
// COMPLEXITY SUMMARY
// ============================================================

System.out.println("\n=== COMPLEXITY SUMMARY ===");
System.out.println("Algorithm | Iterations | Complexity");
System.out.println("-------------------|------------|-----------");
System.out.println("Find Maximum | " + maxIterations + " | O(n)");
System.out.println("Find Minimum | " + minIterations + " | O(n)");
System.out.println("Average | " + marks.length + " | O(n)");
System.out.println("Linear Search | " + searchIterations + " | O(n)");
System.out.println("Count Above | " + marks.length + " | O(n)");



}
}
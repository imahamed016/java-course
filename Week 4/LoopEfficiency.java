// This program analyzes the efficiency of different loop algorithms.
// It counts the number of iterations for each algorithm.

public class LoopEfficiency {
public static void main(String[] args) {

// ============================================================
// ALGORITHM 1: Linear Loop - O(n)
// ============================================================

System.out.println("=== ALGORITHM 1: Linear Loop ===");



// Declare a counter to track iterations.
int count1 = 0;

// Loop n times.
int n = 10;
for (int i = 0; i < n; i++) {
// Increment the counter.
count1++;
}

System.out.println("n = " + n);
System.out.println("Iterations: " + count1);
System.out.println("Time Complexity: O(n)");

// ============================================================
// ALGORITHM 2: Nested Loop - O(n^2)
// ============================================================

System.out.println("\n=== ALGORITHM 2: Nested Loop (Square) ===");

// Declare a counter to track iterations.
int count2 = 0;

// Outer loop runs n times.
for (int i = 0; i < n; i++) {


// Inner loop runs n times for each outer iteration.
for (int j = 0; j < n; j++) {
// Increment the counter.
count2++;
}
}

System.out.println("n = " + n);
System.out.println("Iterations: " + count2);
System.out.println("Time Complexity: O(n^2)");
System.out.println("Formula: n * n = " + (n * n));

// ============================================================
// ALGORITHM 3: Triangular Loop - O(n^2/2)
// ============================================================

System.out.println("\n=== ALGORITHM 3: Triangular Loop ===");

// Declare a counter to track iterations.
int count3 = 0;

// Outer loop runs n times.
for (int i = 0; i < n; i++) {

// Inner loop runs from i to n.
for (int j = i; j < n; j++) {


// Increment the counter.
count3++;
}
}

System.out.println("n = " + n);
System.out.println("Iterations: " + count3);
System.out.println("Formula: n * (n + 1) / 2 = " + (n * (n + 1) / 2));

// ============================================================
// ALGORITHM 4: Loop with Condition - O(n)
// ============================================================

System.out.println("\n=== ALGORITHM 4: Loop with Condition ===");

// Declare a counter to track iterations.
int count4 = 0;

// Loop n times, but only count even numbers.
for (int i = 0; i < n; i++) {
// Check if i is even.
if (i % 2 == 0) {
// Increment the counter only for even numbers.
count4++;
}
}



System.out.println("n = " + n);
System.out.println("Even numbers counted: " + count4);
System.out.println("Total iterations: " + n);
System.out.println("Time Complexity: O(n)");

// ============================================================
// COMPARISON TABLE
// ============================================================

System.out.println("\n=== COMPARISON TABLE ===");
System.out.println("Algorithm | Iterations | Complexity");
System.out.println("----------|------------|------------");
System.out.println("Linear | " + count1 + " | O(n)");
System.out.println("Nested | " + count2 + " | O(n^2)");
System.out.println("Triangular| " + count3 + " | O(n^2/2)");
System.out.println("Condition | " + count4 + " | O(n)");
}
}
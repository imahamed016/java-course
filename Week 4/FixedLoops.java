// This program contains the corrected versions of the infinite loops.

public class FixedLoops {
public static void main(String[] args) {

// ============================================================
// FIXED BUG 1: Print numbers 1 to 5
// ============================================================

System.out.println("=== FIXED BUG 1 ===");

int x = 1;

// Loop while x is less than or equal to 5.
while (x <= 5) {
System.out.println("x = " + x);



// FIX: Increment x so the condition eventually becomes false.
x++;
}

// ============================================================
// FIXED BUG 2: Countdown from 5 to 1
// ============================================================

System.out.println("\n=== FIXED BUG 2 ===");

// FIX: Change i++ to i-- so i decreases toward 1.
for (int i = 5; i >= 1; i--) {
System.out.println("i = " + i);
}

// ============================================================
// FIXED BUG 3: Countdown from 10 to 1
// ============================================================

System.out.println("\n=== FIXED BUG 3 ===");

int y = 10;

// Loop while y is greater than 0.
while (y > 0) {
System.out.println("y = " + y);



// FIX: Decrement y so the condition eventually becomes false.
y--;
}

System.out.println("\nAll loops terminated successfully!");
}
}
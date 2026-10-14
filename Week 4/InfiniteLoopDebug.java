// This program contains infinite loops. Can you find and fix them?

public class InfiniteLoopDebug {
public static void main(String[] args) {

// ============================================================



// BUG 1: Missing increment
// ============================================================

System.out.println("=== BUG 1 ===");

int x = 1;

// The intention: print numbers 1 to 5.
// BUG: x is never incremented, so the condition x <= 5 is always true.
// FIX: Add x++ inside the loop.
while (x <= 5) {
System.out.println("x = " + x);
// Missing: x++;
}

// ============================================================
// BUG 2: Wrong direction
// ============================================================

System.out.println("\n=== BUG 2 ===");

// The intention: print numbers 5 down to 1.
// BUG: i starts at 5 and increments (i++), so i is never >= 1.
// FIX: Change i++ to i--.
for (int i = 5; i >= 1; i++) {
System.out.println("i = " + i);



}

// ============================================================
// BUG 3: Wrong condition
// ============================================================

System.out.println("\n=== BUG 3 ===");

int y = 10;

// The intention: countdown from 10 to 1.
// BUG: Condition is y > 0, but y is decremented only after checking.
// Actually, this loop works! Let's change the bug.

// Real BUG: Condition is always true because y is not decremented.
// FIX: Add y-- inside the loop.
while (y > 0) {
System.out.println("y = " + y);
// Missing: y--;
}
}
}
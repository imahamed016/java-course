// This program contains array index errors. Can you find and fix them?

public class ArrayIndexDebug {
public static void main(String[] args) {

// Declare an array of 5 elements.
int[] numbers = {10, 20, 30, 40, 50};

// ============================================================
// BUG 1: Off-by-one error in loop condition
// ============================================================

System.out.println("=== BUG 1 ===");

// The intention: print all 5 elements.
// BUG: i <= numbers.length allows i to reach 5.
// Valid indices are 0, 1, 2, 3, 4. Index 5 is out of bounds.
// FIX: Change <= to <.
for (int i = 0; i <= numbers.length; i++) {
System.out.println("numbers[" + i + "] = " + numbers[i]);



}

// ============================================================
// BUG 2: Accessing invalid index directly
// ============================================================

System.out.println("\n=== BUG 2 ===");

// The intention: access the last element.
// BUG: numbers[5] is out of bounds for a length-5 array.
// FIX: Use numbers.length - 1 instead of a hardcoded value.
System.out.println("Last element: " + numbers[5]);

// ============================================================
// BUG 3: Negative index
// ============================================================

System.out.println("\n=== BUG 3 ===");

// The intention: access the first element.
// BUG: Index -1 is invalid; arrays start at index 0.
// FIX: Use index 0.
System.out.println("First element: " + numbers[-1]);
}
}
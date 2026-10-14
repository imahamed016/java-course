// This program contains the corrected versions of the array bugs.

public class FixedArrays {
public static void main(String[] args) {

// Declare an array of 5 elements.
int[] numbers = {10, 20, 30, 40, 50};

// ============================================================
// FIXED BUG 1: Print all elements
// ============================================================

System.out.println("=== FIXED BUG 1 ===");


// FIX: Change <= to <. Now i goes from 0 to 4.
for (int i = 0; i < numbers.length; i++) {
System.out.println("numbers[" + i + "] = " + numbers[i]);
}

// ============================================================
// FIXED BUG 2: Access last element
// ============================================================

System.out.println("\n=== FIXED BUG 2 ===");

// FIX: Use numbers.length - 1 to get the last valid index.
System.out.println("Last element: " + numbers[numbers.length - 1]);

// ============================================================
// FIXED BUG 3: Access first element
// ============================================================

System.out.println("\n=== FIXED BUG 3 ===");

// FIX: Use index 0 to get the first element.
System.out.println("First element: " + numbers[0]);

System.out.println("\nAll arrays accessed safely!");
}



}
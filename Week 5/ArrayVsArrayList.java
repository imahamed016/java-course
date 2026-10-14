// This program compares arrays and ArrayLists by implementing
// the same task (managing student names) using both data structures.

// Import ArrayList for the dynamic list.
import java.util.ArrayList;

public class ArrayVsArrayList {
public static void main(String[] args) {

System.out.println("=== ARRAY vs ARRAYLIST COMPARISON ===\n");



// ============================================================
// PART 1: ARRAY – FIXED SIZE
// ============================================================

System.out.println("--- ARRAY APPROACH ---");

// Arrays have a fixed size that must be known at creation.
String[] arrayStudents = new String[3];

// Assign values by index.
arrayStudents[0] = "Alice";
arrayStudents[1] = "Bob";
arrayStudents[2] = "Charlie";

// Print the array contents.
System.out.println("Array contents:");
for (String name : arrayStudents) {
System.out.println(" " + name);
}

// The length is fixed at 3.
System.out.println("Array length: " + arrayStudents.length);

// Cannot add a 4th student without creating a new array.
System.out.println("Cannot add a 4th element without creating a new array.\n");



// ============================================================
// PART 2: ARRAYLIST – DYNAMIC SIZE
// ============================================================

System.out.println("--- ARRAYLIST APPROACH ---");

// ArrayLists don't require a size; they grow dynamically.
ArrayList<String> listStudents = new ArrayList<>();

// Add values using add().
listStudents.add("Alice");
listStudents.add("Bob");
listStudents.add("Charlie");

// Print the ArrayList contents.
System.out.println("ArrayList contents:");
for (String name : listStudents) {
System.out.println(" " + name);
}

// Size can change.
System.out.println("ArrayList size: " + listStudents.size());

// Add a 4th student easily.
listStudents.add("Diana");



System.out.println("After adding Diana, size: " + listStudents.size());

// Remove a student easily.
listStudents.remove("Bob");
System.out.println("After removing Bob, size: " + listStudents.size());
System.out.println("Updated contents: " + listStudents + "\n");

// ============================================================
// PART 3: TRADE-OFF SUMMARY TABLE
// ============================================================

System.out.println("=== TRADE-OFF COMPARISON ===");
System.out.println("Feature | Array | ArrayList");
System.out.println("------------------|--------------|------------");
System.out.println("Size | Fixed | Dynamic");
System.out.println("Data types | Primitives & Objects | Objects only");
System.out.println("Syntax for length | .length | .size()");
System.out.println("Add element | Assign by index | .add()");
System.out.println("Remove element | Manual shift | .remove()");
System.out.println("Memory efficiency | Higher | Lower (overhead)");
System.out.println("Performance | Faster access| Slower access");
System.out.println("Best for | Fixed-size data | Changing-size data");

// ============================================================
// PART 4: PRACTICAL DECISION GUIDE
// ============================================================


System.out.println("\n=== WHEN TO USE WHICH ===");
System.out.println("Use ARRAY when:");
System.out.println(" - The number of elements is known and fixed");
System.out.println(" - You need maximum performance");
System.out.println(" - You are storing primitives");

System.out.println("\nUse ARRAYLIST when:");
System.out.println(" - The number of elements may change");
System.out.println(" - You need methods like add, remove, contains");
System.out.println(" - You are storing objects");
}
}
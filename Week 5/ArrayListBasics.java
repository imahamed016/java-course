// This program demonstrates the basics of ArrayLists in Java.
// ArrayList is a dynamic array that can grow and shrink.

// Import the ArrayList class from java.util package.
import java.util.ArrayList;

public class ArrayListBasics {
public static void main(String[] args) {

// ============================================================
// SECTION 1: CREATING AN ARRAYLIST
// ============================================================

// Create an ArrayList to store Strings.
// The <String> is called a generic type parameter.
// It ensures only Strings can be added to this list.
ArrayList<String> names = new ArrayList<>();



// ============================================================
// SECTION 2: ADDING ELEMENTS – add()
// ============================================================

System.out.println("=== ADDING ELEMENTS ===");

// Add elements to the end of the list.
names.add("Alice");
names.add("Bob");
names.add("Charlie");

System.out.println("After adding: " + names);

// Add an element at a specific index.
// This shifts subsequent elements to the right.
names.add(1, "Diana");

System.out.println("After adding Diana at index 1: " + names);

// ============================================================
// SECTION 3: ACCESSING ELEMENTS – get()
// ============================================================

System.out.println("\n=== ACCESSING ELEMENTS ===");

// Get the element at index 0.


System.out.println("First element: " + names.get(0));

// Get the element at index 2.
System.out.println("Element at index 2: " + names.get(2));

// Get the last element using size() - 1.
System.out.println("Last element: " + names.get(names.size() - 1));

// ============================================================
// SECTION 4: SIZE – size()
// ============================================================

System.out.println("\n=== SIZE ===");

// size() returns the number of elements in the list.
System.out.println("Number of names: " + names.size());

// ============================================================
// SECTION 5: CHECKING FOR ELEMENTS – contains()
// ============================================================

System.out.println("\n=== CONTAINS ===");

// Check if "Bob" is in the list.
System.out.println("Contains Bob? " + names.contains("Bob"));



// Check if "Eve" is in the list.
System.out.println("Contains Eve? " + names.contains("Eve"));

// ============================================================
// SECTION 6: FINDING INDEX – indexOf()
// ============================================================

System.out.println("\n=== INDEX OF ===");

// Find the index of "Charlie".
System.out.println("Index of Charlie: " + names.indexOf("Charlie"));

// Find the index of a non-existent element returns -1.
System.out.println("Index of Eve: " + names.indexOf("Eve"));

// ============================================================
// SECTION 7: REMOVING ELEMENTS – remove()
// ============================================================

System.out.println("\n=== REMOVING ELEMENTS ===");

// Remove by object (name).
names.remove("Bob");

System.out.println("After removing Bob: " + names);



// Remove by index.
names.remove(0);

System.out.println("After removing element at index 0: " + names);

// ============================================================
// SECTION 8: UPDATING ELEMENTS – set()
// ============================================================

System.out.println("\n=== UPDATING ELEMENTS ===");

// Replace element at index 0 with "Eve".
names.set(0, "Eve");

System.out.println("After setting index 0 to Eve: " + names);

// ============================================================
// SECTION 9: ITERATING WITH A FOR LOOP
// ============================================================

System.out.println("\n=== ITERATING WITH TRADITIONAL FOR LOOP ===");

// Loop through the ArrayList by index.
for (int i = 0; i < names.size(); i++) {
System.out.println("Index " + i + ": " + names.get(i));
}



// ============================================================
// SECTION 10: ITERATING WITH ENHANCED FOR LOOP
// ============================================================

System.out.println("\n=== ITERATING WITH ENHANCED FOR LOOP ===");

// For-each loop directly accesses each element.
for (String name : names) {
System.out.println("Name: " + name);
}

// ============================================================
// SECTION 11: CLEARING THE LIST – clear()
// ============================================================

System.out.println("\n=== CLEARING THE LIST ===");

// Remove all elements from the list.
names.clear();

System.out.println("After clearing: " + names);
System.out.println("Size after clearing: " + names.size());

// ============================================================
// SECTION 12: ARRAYLIST OF INTEGERS (WRAPPER CLASSES)



// ============================================================

System.out.println("\n=== ARRAYLIST OF INTEGERS ===");

// ArrayList cannot store primitive int; use Integer (wrapper class).
ArrayList<Integer> scores = new ArrayList<>();

// Autoboxing automatically converts int to Integer.
scores.add(85);
scores.add(92);
scores.add(78);

System.out.println("Scores: " + scores);

// Unboxing automatically converts Integer to int.
int firstScore = scores.get(0);
System.out.println("First score: " + firstScore);

// Sum all scores.
int total = 0;
for (int score : scores) {
total += score;
}
System.out.println("Total: " + total);
}
}
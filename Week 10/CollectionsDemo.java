// This program demonstrates the three main collection types in Java:
// List (ArrayList), Set (HashSet), and Map (HashMap).

// Import all necessary collection classes.
import java.util.ArrayList;



import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionsDemo {
public static void main(String[] args) {

// ============================================================
// 1. LIST (ArrayList) - Ordered, allows duplicates, index-based
// ============================================================
System.out.println("=== LIST (ArrayList) ===");

// Create an ArrayList to store names.
List<String> nameList = new ArrayList<>();

// Add elements. Notice we add "Alice" twice.
nameList.add("Alice");
nameList.add("Bob");
nameList.add("Alice"); // Duplicates are allowed!

// Print the list (maintains insertion order).
System.out.println("List contents: " + nameList);

// Access by index (O(1) time complexity).



System.out.println("Element at index 1: " + nameList.get(1));

// ============================================================
// 2. SET (HashSet) - Unordered, NO duplicates
// ============================================================
System.out.println("\n=== SET (HashSet) ===");

// Create a HashSet to store names.
Set<String> nameSet = new HashSet<>();

// Add elements.
nameSet.add("Alice");
nameSet.add("Bob");
nameSet.add("Alice"); // Duplicate! This will be ignored.
nameSet.add("Charlie");

// Print the set. Notice it is NOT in insertion order.
System.out.println("Set contents: " + nameSet);

// Check if an element exists (O(1) time complexity).
System.out.println("Does the set contain Bob? " + nameSet.contains("Bob"));

// ============================================================
// 3. MAP (HashMap) - Key-Value pairs, NO duplicate keys
// ============================================================
System.out.println("\n=== MAP (HashMap) ===");



// Create a HashMap to store Student IDs (Key) and Names (Value).
Map<Integer, String> studentMap = new HashMap<>();

// Add key-value pairs using put().
studentMap.put(101, "Alice");
studentMap.put(102, "Bob");
studentMap.put(103, "Charlie");
studentMap.put(101, "David"); // Key 101 already exists! Value is overwritten.

// Print the map.
System.out.println("Map contents: " + studentMap);

// Access a value by its key (O(1) time complexity).
System.out.println("Student with ID 102: " + studentMap.get(102));

// Iterate through a map using a for-each loop over entrySet().
System.out.println("Iterating through the Map:");
for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
// getKey() returns the ID, getValue() returns the Name.
System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
}
}
}
// This program demonstrates the basics of arrays in Java.

public class ArrayBasics {
public static void main(String[ ] args) {

// ============================================================


// SECTION 1: DECLARING AND INITIALIZING ARRAYS
// ============================================================

// Method 1: Declare array with size, then assign values individually.
// int[] means "an array of integers".
// new int[5] creates space for 5 integers (all initialized to 0).
int[] numbers = new int[5];

// Assign values to each element using the index.
// Array indices start at 0.
numbers[0] = 10; // First element (index 0)
numbers[1] = 20; // Second element (index 1)
numbers[2] = 30; // Third element (index 2)
numbers[3] = 40; // Fourth element (index 3)
numbers[4] = 50; // Fifth element (index 4)

// Method 2: Declare and initialize in one line using curly braces.
// The array size is determined automatically by the number of values.
int[] scores = {85, 92, 78, 95, 88, 76, 90};

// Method 3: Declare a String array.
String [ ] names = {"Alice", "Bob", "Charlie", "Diana"};
// ============================================================
// SECTION 2: ACCESSING ARRAY ELEMENTS
// ============================================================



System.out.println("=== ACCESSING ARRAY ELEMENTS ===");
// Access individual elements using index.
System.out.println("First number: " + numbers[0]); // 10
System.out.println("Third number: " + numbers[2]); // 30
System.out.println("Last number: " + numbers[4]); // 50

// Access the length of the array using the length property.
System.out.println("Length of numbers array: " + numbers.length);
System.out.println("Length of scores array: " + scores.length);
System.out.println("Length of names array: " + names.length);

// ============================================================
// SECTION 3: ITERATING WITH A TRADITIONAL FOR LOOP
// ============================================================

System.out.println("\n=== TRADITIONAL FOR LOOP ===");

// Loop through the array using the index.
// i starts at 0 and goes up to length - 1.
for (int i = 0; i < numbers.length; i++) {
// Access element at index i.
System.out.println("numbers[" + i + "] = " + numbers[i]);
}

// ============================================================
// SECTION 4: ITERATING WITH AN ENHANCED FOR LOOP



// ============================================================

System.out.println("\n=== ENHANCED FOR LOOP ===");

// Enhanced for loop (for-each) iterates through all elements.
// No need for index; variable gets each element in turn.
for (int num : numbers) {
System.out.println("Value: " + num);
}

System.out.println("\n=== NAMES ARRAY ===");

// Enhanced for loop with strings.
for (String name : names) {
System.out.println("Name: " + name);
}

// ============================================================
// SECTION 5: DEFAULT VALUES
// ============================================================

System.out.println("\n=== DEFAULT VALUES ===");

// Create an array without assigning values.
int[] defaultInts = new int[3];



// Default value for int array is 0.
System.out.println("Default int: " + defaultInts[0]); // 0

// Create a boolean array.
boolean[] defaultBooleans = new boolean[3];

// Default value for boolean array is false.
System.out.println("Default boolean: " + defaultBooleans[0]); // false

// Create a String array.
String[ ] defaultStrings = new String[3];

// Default value for String array is null.
System.out.println("Default String: " + defaultStrings[0]); // null
}
}
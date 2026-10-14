// This program demonstrates the do-while loop using a menu system.
// The menu is displayed at least once, then repeats until the user exits.

// Import the Scanner class for user input.
import java.util.Scanner;

public class MenuSystem {
public static void main(String[] args) {


// Create a Scanner object to read input from the keyboard.
Scanner scanner = new Scanner(System.in);

// Declare a variable to store the user's menu choice.
// Initialize to 0 so we can enter the loop.
int choice = 0;

// ============================================================
// DO-WHILE LOOP: Display menu at least once, repeat until exit.
// ============================================================
// The loop body executes FIRST, then the condition is checked.
// This guarantees the menu appears at least once.
// ============================================================

do {
// Display the menu options.
System.out.println("\n========================================");
System.out.println(" STUDENT MANAGEMENT SYSTEM");
System.out.println("========================================");
System.out.println("1. Add Student");
System.out.println("2. View All Students");
System.out.println("3. Search Student");
System.out.println("4. Exit");
System.out.println("========================================");
System.out.print("Enter your choice (1-4): ");



// Read the user's choice.
choice = scanner.nextInt();
scanner.nextLine(); // Consume the newline character.

// ============================================================
// SWITCH STATEMENT: Handle the user's choice.
// ============================================================

switch (choice) {
case 1:
// Option 1: Add Student
System.out.print("Enter student name: ");
String name = scanner.nextLine();
System.out.println("✓ Student '" + name + "' added successfully.");
break;

case 2:
// Option 2: View All Students
System.out.println("Displaying all students...");
System.out.println("(This is a simulation - no data stored yet.)");
break;

case 3:
// Option 3: Search Student
System.out.print("Enter student name to search: ");


String searchName = scanner.nextLine();
System.out.println("Searching for '" + searchName + "'...");
System.out.println("(This is a simulation - no data stored yet.)");
break;

case 4:
// Option 4: Exit
System.out.println("\nThank you for using the Student Management System.");
System.out.println("Goodbye!");
break;

default:
// Invalid choice
System.out.println("✗ Invalid choice. Please enter 1, 2, 3, or 4.");
break;
}

} while (choice != 4); // Continue until user chooses 4 (Exit).

// Close the scanner to free resources.
scanner.close();
}
}
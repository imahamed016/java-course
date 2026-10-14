// This program integrates arrays and ArrayLists to manage a student roster.
// It uses an array for fixed data (subjects) and an ArrayList for dynamic
// data (student names and marks).

// Import Scanner and ArrayList.
import java.util.Scanner;
import java.util.ArrayList;

public class StudentRoster {
public static void main(String[] args) {

// Create a Scanner object for user input.
Scanner scanner = new Scanner(System.in);



// ============================================================
// SECTION 1: FIXED DATA – SUBJECTS (ARRAY)
// ============================================================

// The subjects offered are fixed; an array is appropriate.
String[] subjects = {"Math", "English", "Science"};

// ============================================================
// SECTION 2: DYNAMIC DATA – STUDENTS (ARRAYLIST)
// ============================================================

// Student names and marks may grow, so use ArrayLists.
ArrayList<String> studentNames = new ArrayList<>();
ArrayList<int[]> studentMarks = new ArrayList<>();

// ============================================================
// SECTION 3: ADD INITIAL STUDENTS
// ============================================================

// Add sample students (name and marks array).
studentNames.add("Alice");
studentMarks.add(new int[]{85, 90, 78});

studentNames.add("Bob");
studentMarks.add(new int[]{72, 88, 91});



studentNames.add("Charlie");
studentMarks.add(new int[]{65, 75, 80});

// ============================================================
// SECTION 4: MAIN MENU (do-while loop)
// ============================================================

int choice;

do {
System.out.println("\n==============================================");
System.out.println(" STUDENT ROSTER MANAGER");
System.out.println("==============================================");
System.out.println("1. Add New Student");
System.out.println("2. View All Students");
System.out.println("3. View Class Average");
System.out.println("4. Search Student by Name");
System.out.println("5. Remove Student");
System.out.println("6. Exit");
System.out.println("==============================================");
System.out.print("Enter your choice (1-6): ");

// Read the choice.
choice = scanner.nextInt();
scanner.nextLine(); // Consume newline



// ============================================================
// SWITCH: Handle the user's choice.
// ============================================================

switch (choice) {

case 1:
// Add a new student.
System.out.print("Enter student name: ");
String name = scanner.nextLine();

// Create an array for this student's marks.
int[] marks = new int[subjects.length];

// Loop through subjects and read marks.
for (int i = 0; i < subjects.length; i++) {
System.out.print("Enter mark for " + subjects[i] + ": ");
marks[i] = scanner.nextInt();
}
scanner.nextLine(); // Consume newline

// Add student to the lists.
studentNames.add(name);
studentMarks.add(marks);



System.out.println("✓ Student '" + name + "' added successfully.");
break;

case 2:
// View all students.
System.out.println("\n=== STUDENT ROSTER ===");
if (studentNames.isEmpty()) {
System.out.println("No students in the roster.");
} else {
// Print table header.
System.out.printf("%-12s", "Student");
for (String subject : subjects) {
System.out.printf("%-12s", subject);
}
System.out.println("Average");
System.out.println("------------------------------------------------");

// Loop through all students.
for (int i = 0; i < studentNames.size(); i++) {
System.out.printf("%-12s", studentNames.get(i));

int total = 0;
int[] marks1 = studentMarks.get(i);

// Loop through marks for this student.
for (int mark : marks1) {


System.out.printf("%-12d", mark);
total += mark;
}

// Calculate and print the average.
double avg = (double) total / marks1.length;
System.out.printf("%.2f%n", avg);
}
}
break;

case 3:
// View class average.
if (studentNames.isEmpty()) {
System.out.println("No students to calculate average.");
} else {
int grandTotal = 0;
int totalMarks = 0;

// Loop through all students and sum their marks.
for (int[] studentMarkSet : studentMarks) {
for (int mark : studentMarkSet) {
grandTotal += mark;
totalMarks++;
}
}


double classAvg = (double) grandTotal / totalMarks;
System.out.printf("Class Average: %.2f%n", classAvg);
}
break;

case 4:
// Search for a student.
System.out.print("Enter name to search: ");
String searchName = scanner.nextLine();

// Find the index of the student.
int index = studentNames.indexOf(searchName);

if (index != -1) {
// Student found; print details.
System.out.println("\n=== STUDENT FOUND ===");
System.out.println("Name: " + studentNames.get(index));
int[] marks1 = studentMarks.get(index);
for (int i = 0; i < subjects.length; i++) {
System.out.println(subjects[i] + ": " + marks1[i]);
}
} else {
System.out.println("✗ Student '" + searchName + "' not found.");
}
break;



case 5:
// Remove a student.
System.out.print("Enter name to remove: ");
String removeName = scanner.nextLine();

int removeIndex = studentNames.indexOf(removeName);

if (removeIndex != -1) {
studentNames.remove(removeIndex);
studentMarks.remove(removeIndex);
System.out.println("✓ Student '" + removeName + "' removed.");
} else {
System.out.println("✗ Student '" + removeName + "' not found.");
}
break;

case 6:
// Exit the program.
System.out.println("Thank you for using the Student Roster Manager!");
break;

default:
// Invalid choice.
System.out.println("✗ Invalid choice. Please enter 1-6.");
break;



}

} while (choice != 6);

// Close the scanner.
scanner.close();
}
}
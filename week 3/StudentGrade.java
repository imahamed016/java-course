// This program determines a student's grade based on marks.
// It uses nested if-else to first validate the marks, then assign a grade.

public class StudentGrade {
public static void main(String[] args) {

// Declare an integer variable for marks and assign it the value 75.
int marks = 75;

// Outer if: check if marks are within the valid range (0 to 100).
if (marks >= 0 && marks <= 100) {
// Marks are valid. Now determine the grade using inner if-else.

// Check if marks are 70 or above.
if (marks >= 70) {
// If true, print grade A.
System.out.println("Grade: A");
}
// If marks are not >= 70, check if they are >= 60.
else if (marks >= 60) {
// If true, print grade B.
System.out.println("Grade: B");
}
// If marks are not >= 60, check if they are >= 50.



else if (marks >= 50) {
// If true, print grade C.
System.out.println("Grade: C");
}
// If marks are not >= 50, check if they are >= 40.
else if (marks >= 40) {
// If true, print grade D.
System.out.println("Grade: D");
}
// If none of the above, marks must be below 40.
else {
// Print grade F (Fail).
System.out.println("Grade: F (Fail)");
}
}
// If marks are not between 0 and 100, they are invalid.
else {
// Print an error message.
System.out.println("Invalid marks! Please enter a value between 0 and 100.");
}
}
}
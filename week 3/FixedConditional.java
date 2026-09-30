// This program corrects the logic error.

public class FixedConditional {
public static void main(String[ ] args) {

// Declare a variable for the user's age.
int age = 20;

// Correct condition: age must be >= 18 AND <= 65.
if (age >= 18 && age <= 65) {
System.out.println("You are of working age.");
} else {
System.out.println("You are not of working age.");



}
}
}
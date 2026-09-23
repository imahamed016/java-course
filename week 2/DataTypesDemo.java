// This program demonstrates the use of different data types in Java.
// Each variable is declared with the most appropriate data type for its purpose.

public class DataTypesDemo {
public static void main(String[] args) {

// ============================================================
// INTEGER TYPES - used for whole numbers
// ============================================================

// byte: 8-bit signed integer, range -128 to 127
// Used for small numbers to save memory.
byte studentAge = 20;

// short: 16-bit signed integer, range -32,768 to 32,767
// Used for medium-sized numbers.
short yearOfBirth = 2006;

// int: 32-bit signed integer, range -2.1 billion to 2.1 billion
// Most commonly used integer type.
int population = 54000000; // Kenya's population


// long: 64-bit signed integer, range very large
// Used for very large numbers. Note the 'L' suffix.
long worldPopulation = 8000000000L;

// ============================================================
// DECIMAL TYPES - used for numbers with decimal points
// ============================================================

// float: 32-bit floating point, ~7 decimal digits precision
// Used for less precise decimal numbers. Note the 'f' suffix.
float interestRate = 7.5f;

// double: 64-bit floating point, ~15 decimal digits precision
// Most commonly used decimal type. No suffix needed.
double accountBalance = 15000.75;

// ============================================================
// CHARACTER TYPE - used for single characters
// ============================================================

// char: 16-bit Unicode character, enclosed in single quotes
char grade = 'A';
char currencySymbol = 'K';

// ============================================================
// BOOLEAN TYPE - used for true/false values



// ============================================================

// boolean: only two possible values - true or false
boolean isActive = true;
boolean isVerified = false;

// ============================================================
// STRING TYPE - used for text (sequence of characters)
// ============================================================

// String: reference type, enclosed in double quotes
String studentName = "Alice Wanjiku";
String courseName = "Object-Oriented Programming";

// ============================================================
// PRINTING ALL VARIABLES WITH LABELS
// ============================================================

System.out.println("=== INTEGER TYPES ===");
System.out.println("Student Age (byte): " + studentAge);
System.out.println("Year of Birth (short): " + yearOfBirth);
System.out.println("Kenya Population (int): " + population);
System.out.println("World Population (long): " + worldPopulation);

System.out.println("\n=== DECIMAL TYPES ===");
System.out.println("Interest Rate (float): " + interestRate + "%");



System.out.println("Account Balance (double): KSh " + accountBalance);

System.out.println("\n=== CHARACTER TYPE ===");
System.out.println("Grade (char): " + grade);
System.out.println("Currency Symbol (char): " + currencySymbol);

System.out.println("\n=== BOOLEAN TYPE ===");
System.out.println("Is Active (boolean): " + isActive);
System.out.println("Is Verified (boolean): " + isVerified);

System.out.println("\n=== STRING TYPE ===");
System.out.println("Student Name (String): " + studentName);
System.out.println("Course Name (String): " + courseName);
}
}
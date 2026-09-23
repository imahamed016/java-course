// This program demonstrates implicit and explicit type conversion.
// It also shows what happens when types don't match.

public class TypeConversion {
public static void main(String[] args) {

// ============================================================
// IMPLICIT CASTING (WIDENING) - automatic
// ============================================================

// int to double: smaller type to larger type.
// No data loss occurs.
int intValue = 100;
double doubleValue = intValue; // Automatic conversion

System.out.println("=== IMPLICIT CASTING ===");
System.out.println("int value: " + intValue);
System.out.println("double value (from int): " + doubleValue);

// int to long: automatic widening.
long longValue = intValue;


System.out.println("long value (from int): " + longValue);

// float to double: automatic widening.
float floatValue = 3.14f;
double doubleFromFloat = floatValue;
System.out.println("double value (from float): " + doubleFromFloat);

// ============================================================
// EXPLICIT CASTING (NARROWING) - manual
// ============================================================

// double to int: larger type to smaller type.
// Data loss occurs - decimal part is truncated.
double pi = 3.14159;
int truncatedPi = (int) pi; // Explicit cast with (int)

System.out.println("\n=== EXPLICIT CASTING ===");
System.out.println("double pi: " + pi);
System.out.println("int pi (truncated): " + truncatedPi);

// double to float: explicit cast required.
double largeDouble = 123.456789;
float smallFloat = (float) largeDouble;
System.out.println("double value: " + largeDouble);
System.out.println("float value (cast): " + smallFloat);


// ============================================================
// TYPE MISMATCH ERRORS
// ============================================================

// The following lines would cause compilation errors if uncommented:

// ERROR 1: Cannot assign double to int without cast
// int wrongInt = 3.14;

// ERROR 2: Cannot assign String to int
// int wrongString = "100";

// ERROR 3: Cannot assign boolean to int
// int wrongBoolean = true;

// ERROR 4: Cannot assign char to String
// String wrongChar = 'A';

System.out.println("\n=== TYPE MISMATCH ERRORS ===");
System.out.println("The following lines would cause compilation errors:");
System.out.println("int wrongInt = 3.14; // double to int without cast");
System.out.println("int wrongString = \"100\"; // String to int");
System.out.println("int wrongBoolean = true; // boolean to int");
System.out.println("String wrongChar = 'A'; // char to String");

// ============================================================



// STRING CONVERSION
// ============================================================

// Converting numbers to String using concatenation.
int number = 42;
String numberString = "" + number; // Convert int to String

// Converting String to int using Integer.parseInt().
String numericString = "123";
int parsedInt = Integer.parseInt(numericString);

// Converting String to double using Double.parseDouble().
String decimalString = "45.67";
double parsedDouble = Double.parseDouble(decimalString);

System.out.println("\n=== STRING CONVERSION ===");
System.out.println("Number as string: " + numberString);
System.out.println("Parsed int: " + parsedInt);
System.out.println("Parsed double: " + parsedDouble);
}
}
// This program demonstrates arithmetic, relational, and logical operators.
// It also shows operator precedence and type conversion.

public class OperatorsDemo {
public static void main(String[] args) {

// ============================================================
// ARITHMETIC OPERATORS
// ============================================================

// Declare two integer variables.
int a = 17;
int b = 5;

// Addition: adds two numbers.
int sum = a + b;

// Subtraction: subtracts second from first.



int difference = a - b;

// Multiplication: multiplies two numbers.
int product = a * b;

// Division: integer division (decimal part truncated).
int quotient = a / b;

// Modulus: remainder of division.
int remainder = a % b;

System.out.println("=== ARITHMETIC OPERATORS ===");
System.out.println("a = " + a + ", b = " + b);
System.out.println("Sum (a + b): " + sum);
System.out.println("Difference (a - b): " + difference);
System.out.println("Product (a * b): " + product);
System.out.println("Quotient (a / b): " + quotient);
System.out.println("Remainder (a % b): " + remainder);

// ============================================================
// OPERATOR PRECEDENCE
// ============================================================

// Multiplication and division have higher precedence than addition.
// Expression: 10 + 5 * 2
// Step 1: 5 * 2 = 10



// Step 2: 10 + 10 = 20
int precedence1 = 10 + 5 * 2;

// Parentheses can override precedence.
// Expression: (10 + 5) * 2
// Step 1: 10 + 5 = 15
// Step 2: 15 * 2 = 30
int precedence2 = (10 + 5) * 2;

// Modulus has same precedence as multiplication and division.
// Expression: 20 % 3 + 4 * 2
// Step 1: 20 % 3 = 2
// Step 2: 4 * 2 = 8
// Step 3: 2 + 8 = 10
int precedence3 = 20 % 3 + 4 * 2;

System.out.println("\n=== OPERATOR PRECEDENCE ===");
System.out.println("10 + 5 * 2 = " + precedence1);
System.out.println("(10 + 5) * 2 = " + precedence2);
System.out.println("20 % 3 + 4 * 2 = " + precedence3);

// ============================================================
// RELATIONAL OPERATORS
// ============================================================

// Relational operators return boolean values (true or false).


boolean isEqual = (a == b); // Equal to
boolean isNotEqual = (a != b); // Not equal to
boolean isGreater = (a > b); // Greater than
boolean isLess = (a < b); // Less than
boolean isGreaterOrEqual = (a >= b); // Greater than or equal
boolean isLessOrEqual = (a <= b); // Less than or equal

System.out.println("\n=== RELATIONAL OPERATORS ===");
System.out.println("a == b: " + isEqual);
System.out.println("a != b: " + isNotEqual);
System.out.println("a > b: " + isGreater);
System.out.println("a < b: " + isLess);
System.out.println("a >= b: " + isGreaterOrEqual);
System.out.println("a <= b: " + isLessOrEqual);

// ============================================================
// LOGICAL OPERATORS
// ============================================================

// Logical operators combine boolean expressions.
boolean x = true;
boolean y = false;

boolean andResult = x && y; // AND: true only if both are true
boolean orResult = x || y; // OR: true if at least one is true
boolean notResult = !x; // NOT: reverses the value


System.out.println("\n=== LOGICAL OPERATORS ===");
System.out.println("x = " + x + ", y = " + y);
System.out.println("x && y: " + andResult);
System.out.println("x || y: " + orResult);
System.out.println("!x: " + notResult);

// ============================================================
// INCREMENT AND DECREMENT OPERATORS
// ============================================================

int counter = 5;

// Post-increment: use current value, then increment.
int postIncrement = counter++;

// Pre-increment: increment first, then use new value.
int preIncrement = ++counter;

System.out.println("\n=== INCREMENT/DECREMENT ===");
System.out.println("counter after post-increment: " + postIncrement);
System.out.println("counter after pre-increment: " + preIncrement);
System.out.println("Final counter value: " + counter);
}
}
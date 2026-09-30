// This program verifies the analysis of a complex boolean expression.

public class BooleanAnalysis {
public static void main(String[] args) {

// Evaluate the expression step by step and print intermediate results.
boolean part1 = (5 > 3); // true
boolean part2 = (4 < 2); // false
boolean part3 = (10 >= 10); // true

// Print each part.
System.out.println("5 > 3: " + part1);
System.out.println("4 < 2: " + part2);
System.out.println("10 >= 10: " + part3);

// Combine using && and ||.
// Operator precedence: && before ||
// So: (part1 && part2) || part3
boolean intermediate = part1 && part2; // true && false = false
System.out.println("part1 && part2: " + intermediate);

boolean finalResult = intermediate || part3; // false || true = true
System.out.println("Final result: " + finalResult);

// Direct evaluation for verification.



boolean directResult = (5 > 3) && (4 < 2) || (10 >= 10);
System.out.println("Direct result: " + directResult);
}
}
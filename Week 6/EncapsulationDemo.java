// This program demonstrates why encapsulation is important.
// It compares a poorly designed class (public fields) with a well-designed class (private fields).

// ============================================================
// POORLY DESIGNED CLASS (Violates Encapsulation)
// ============================================================
class BadStudent {
// These fields are PUBLIC, meaning ANY other class can change them directly.
// There is no validation. A student's age could be set to -100!
public String name;



public int age;
public double gpa;
}

// ============================================================
// WELL-DESIGNED CLASS (Follows Encapsulation)
// ============================================================
class GoodStudent {
// These fields are PRIVATE, meaning they are hidden from other classes.
// They can only be accessed or modified through the public methods below.
private String name;
private int age;
private double gpa;

// Constructor to initialize the fields safely.
public GoodStudent(String name, int age, double gpa) {
// We use 'this' to refer to the object's fields, and validate the data.
this.name = name;
setAge(age); // Use setter for validation
setGpa(gpa); // Use setter for validation
}

// GETTER for name
public String getName() {
return name;
}



// SETTER for name
public void setName(String name) {
this.name = name;
}

// GETTER for age
public int getAge() {
return age;
}

// SETTER for age with VALIDATION
public void setAge(int age) {
// Only allow ages between 0 and 150.
if (age >= 0 && age <= 150) {
this.age = age;
} else {
System.out.println("Error: Invalid age. Age must be between 0 and 150.");
}
}

// GETTER for GPA
public double getGpa() {
return gpa;
}



// SETTER for GPA with VALIDATION
public void setGpa(double gpa) {
// Only allow GPAs between 0.0 and 4.0.
if (gpa >= 0.0 && gpa <= 4.0) {
this.gpa = gpa;
} else {
System.out.println("Error: Invalid GPA. GPA must be between 0.0 and 4.0.");
}
}
}

// ============================================================
// MAIN CLASS
// ============================================================
public class EncapsulationDemo {
public static void main(String[] args) {

System.out.println("=== TESTING BAD STUDENT ===");

// Create a BadStudent object.
BadStudent bad = new BadStudent();

// Directly accessing and modifying public fields. No validation!
bad.name = "Alice";
bad.age = -100; // No error! This is impossible in real life.
bad.gpa = 15.5; // No error! GPA cannot be 15.5.



// Print the corrupted data.
System.out.println("BadStudent Name: " + bad.name);
System.out.println("BadStudent Age: " + bad.age + " (Corrupted!)");
System.out.println("BadStudent GPA: " + bad.gpa + " (Corrupted!)");

System.out.println("\n=== TESTING GOOD STUDENT ===");

// Create a GoodStudent object using the constructor.
GoodStudent good = new GoodStudent("Bob", 20, 3.5);

// Print valid data using getters.
System.out.println("GoodStudent Name: " + good.getName());
System.out.println("GoodStudent Age: " + good.getAge());
System.out.println("GoodStudent GPA: " + good.getGpa());

// Attempt to corrupt the data using setters.
System.out.println("\nAttempting to set invalid age and GPA...");
good.setAge(-100); // Should trigger validation error
good.setGpa(15.5); // Should trigger validation error

// Data remains safe and unchanged.
System.out.println("GoodStudent Age after invalid attempt: " + good.getAge());
System.out.println("GoodStudent GPA after invalid attempt: " + good.getGpa());
}
}
// This class demonstrates constructor chaining and the 'this' keyword.

public class Employee {

// Private fields
private int id;
private String name;
private double salary;
private String department;



// ============================================================
// CONSTRUCTOR 3: Overloaded (Only id and name)
// ============================================================
public Employee(int id, String name) {


// Chain to Constructor 2, providing a default salary.
// Constructor 2 will then chain to Constructor 1.
this(id, name, 25000.0);
}

// ============================================================
// CONSTRUCTOR 2: Overloaded (No department specified)
// ============================================================
public Employee(int id, String name, double salary) {
// CONSTRUCTOR CHAINING: this() calls another constructor.
// It MUST be the first line in the constructor.
// Here, we call Constructor 1 and provide a default department.
this(id, name, salary, "Unassigned");
}

// ============================================================
// CONSTRUCTOR 1: Master Constructor (Takes all arguments)
// ============================================================
public Employee(int id, String name, double salary, String department) {
// 'this' distinguishes the instance variable from the parameter.
// Without 'this', id = id would assign the parameter to itself!
this.id = id;
this.name = name;
this.salary = salary;
this.department = department;
}

public void displayInfo() {
System.out.println("ID: " + id + " | Name: " + name +
" | Salary: " + salary + " | Dept: " + department);
}

// ============================================================
// METHODS
// ============================================================
public void giveRaise(double amount) {
if (amount > 0) {
// 'this' is optional here, but clarifies that we are modifying the instance field.
this.salary += amount;
System.out.println(name + " received a raise. New salary: " + this.salary);
}
}
}
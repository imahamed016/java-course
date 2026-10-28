public class EmployeeTest {
public static void main(String[] args) {


System.out.println("=== TESTING CONSTRUCTORS ===");

// Using Constructor 1 (All parameters)
Employee e1 = new Employee(101, "Alice", 50000.0, "IT");
e1.displayInfo();

// Using Constructor 2 (No department)
Employee e2 = new Employee(102, "Bob", 45000.0);
e2.displayInfo();

// Using Constructor 3 (Only ID and Name)
Employee e3 = new Employee(103, "Charlie");
e3.displayInfo();

System.out.println("\n=== TESTING METHODS ===");
e3.giveRaise(5000.0);
e3.displayInfo();
}
}
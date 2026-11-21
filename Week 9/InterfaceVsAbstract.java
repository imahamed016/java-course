// This program demonstrates the difference between an Abstract Class and an Interface.

// ============================================================
// ABSTRACT CLASS



// ============================================================
// Represents an "IS-A" relationship with shared code (state/behavior).
abstract class Animal {
// Abstract classes can have fields (state).
protected String name;

public Animal(String name) {
this.name = name;
}

// Concrete method: Shared by all animals.
public void sleep() {
System.out.println(name + " is sleeping.");
}

// Abstract method: Must be implemented by subclasses.
public abstract void makeSound();
}

// ============================================================
// INTERFACE
// ============================================================
// Represents a "CAN-DO" capability. It defines a contract with NO state (fields).
// By default, all methods in an interface are public and abstract.
interface Flyable {
// Interfaces cannot have instance fields like 'name'.


// They can only have constants (public static final).
int MAX_ALTITUDE = 10000;

// Abstract method: Must be implemented by any class that implements this interface.
void fly();
}

// ============================================================
// SUBCLASS IMPLEMENTING BOTH
// ============================================================
// A Bird IS-AN Animal, and it CAN-DO Fly.
// Note: We use 'extends' for the class and 'implements' for the interface.
class Bird extends Animal implements Flyable {

public Bird(String name) {
super(name); // Call the abstract class constructor.
}

// Implementing the abstract method from Animal.
@Override
public void makeSound() {
System.out.println(name + " says: Tweet! Tweet!");
}

// Implementing the method from the Flyable interface.
@Override



public void fly() {
System.out.println(name + " is flying up to " + MAX_ALTITUDE + " feet.");
}
}

// ============================================================
// MAIN CLASS
// ============================================================
public class InterfaceVsAbstract {
public static void main(String[] args) {
// Create a Bird object.
Bird myBird = new Bird("Tweety");

// Call methods from Animal (Abstract Class).
myBird.sleep();
myBird.makeSound();

// Call methods from Flyable (Interface).
myBird.fly();
}
}
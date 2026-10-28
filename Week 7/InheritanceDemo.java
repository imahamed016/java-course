// This program demonstrates the basics of inheritance using the 'extends' keyword.

// ============================================================
// SUPERCLASS (Parent)
// ============================================================
class Animal {
// A protected field. It can be accessed by this class and any subclass.
protected String name;

// Constructor for Animal
public Animal(String name) {
this.name = name;
}

// A behavior shared by all animals.
public void eat() {


System.out.println(name + " is eating.");
}

// Another shared behavior.
public void sleep() {
System.out.println(name + " is sleeping.");
}
}

// ============================================================
// SUBCLASS (Child)
// ============================================================
// The 'extends' keyword means Dog inherits allViewController everything from Animal.
class Dog extends Animal {

// Constructor for Dog
public Dog(String name) {
// Call the superclass (Animal) constructor.
// Must be the very first line in the constructor.
super(name);
}

// A behavior unique to Dog (not in Animal).
public void bark() {
System.out.println(name + " is barking: Woof! Woof!");
}

}

// ============================================================
// MAIN CLASS
// ============================================================
public class InheritanceDemo {
public static void main(String[] args) {

// Create a Dog object.
Dog myDog = new Dog("Buddy");

// Call a method inherited from Animal.
myDog.eat(); // Inherited method

// Call a method inherited from Animal.
myDog.sleep(); // Inherited method

// Call a method defined ONLY in Dog.
myDog.bark(); // Subclass-specific method
}
}
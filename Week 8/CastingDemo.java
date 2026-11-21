
// This program demonstrates Upcasting, Downcasting, and how to prevent
// the dreaded ClassCastException using the 'instanceof' operator.

class Vehicle { }
class Car extends Vehicle {
public void openTrunk() {
System.out.println("Trunk opened.");
}
}
class Bike extends Vehicle { }

public class CastingDemo {
public static void main(String[] args) {



// UPCASTING (Implicit): Assigning a subclass to a superclass reference.
// This is always safe.
Vehicle v1 = new Car();
Vehicle v2 = new Bike();

System.out.println("Upcasting successful.");

// DOWNCASTING (Explicit): Assigning a superclass reference back to a subclass.
// This is DANGEROUS if you don't check the actual type!

// THE BUG: v2 is actually a Bike, but we are trying to force it to be a Car.
// If you uncomment the line below, the program will CRASH with a ClassCastException.
// Car myCar = (Car) v2;
// myCar.openTrunk();

// THE FIX: Always use the 'instanceof' operator to check the type BEFORE downcasting.
System.out.println("\nChecking types safely...");

if (v1 instanceof Car) {
// It is safe to cast because v1 is actually a Car.
Car c1 = (Car) v1;
c1.openTrunk(); // Works perfectly.
}

if (v2 instanceof Car) {
// This block will NOT execute because v2 is a Bike, not a Car.


System.out.println("This will not print.");
} else {
System.out.println("v2 is not a Car, it is a Bike. Downcasting prevented!");
}
}
}
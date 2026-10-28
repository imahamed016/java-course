// This program demonstrates Composition (HAS-A relationship).
// We use instance variables instead of 'extends'.

// The Engine class (Independent component).
class Engine {
public void start() {
System.out.println("Engine started.");
}
}

// The Car class (Uses Composition).
class Car {
// The Car HAS-A Engine.
// We create an Engine object as a field.
private Engine engine;

// Constructor initializes the Engine.
public Car() {
this.engine = new Engine();
}

// The Car delegates the starting action to its Engine.
public void startCar() {
System.out.println("Car is starting...");



// Call the Engine's method.
engine.start();
}
}

public class CompositionDemo {
public static void main(String[] args) {
Car myCar = new Car();
myCar.startCar();
}
}
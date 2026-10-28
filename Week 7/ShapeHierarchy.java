// This program demonstrates designing a class hierarchy with inheritance.

// ============================================================
// SUPERCLASS
// ============================================================
class Shape {
// Common attribute for all shapes.
protected String name;

// Constructor
public Shape(String name) {
this.name = name;
}

// A method to be overridden by subclasses.
public double calculateArea() {
return 0.0;
}

// Overriding the toString() method from the Object class.
// This is used when you print an object.
@Override
public String toString() {
return "Shape: " + name;
}
}



// ============================================================
// SUBCLASS 1
// ============================================================
class Circle extends Shape {
private double radius;

public Circle(String name, double radius) {
super(name); // Call Shape constructor
this.radius = radius;
}

// Override calculateArea for Circle
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}

// Override toString
@Override
public String toString() {
return super.toString() + " | Radius: " + radius;
}
}

// ============================================================



// SUBCLASS 2
// ============================================================
class Rectangle extends Shape {
private double length;
private double width;

public Rectangle(String name, double length, double width) {
super(name); // Call Shape constructor
this.length = length;
this.width = width;
}

// Override calculateArea for Rectangle
@Override
public double calculateArea() {
return length * width;
}

// Override toString
@Override
public String toString() {
return super.toString() + " | Length: " + length + ", Width: " + width;
}
}

// ============================================================



// MAIN CLASS
// ============================================================
public class ShapeHierarchy {
public static void main(String[] args) {

// Create a Circle
Circle c = new Circle("My Circle", 5.0);
System.out.println(c.toString());
System.out.println("Area: " + c.calculateArea());

System.out.println();

// Create a Rectangle
Rectangle r = new Rectangle("My Rectangle", 4.0, 6.0);
System.out.println(r.toString());
System.out.println("Area: " + r.calculateArea());
}
}
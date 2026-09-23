// Object-oriented approach: data and methods are bundled together in a class.
public class RectangleOOP {

// Private fields (attributes) – encapsulated.
// They can only be accessed through methods.
private double length;
private double width;

// Constructor: initializes the fields when an object is created.
public RectangleOOP(double length, double width) {
// 'this' refers to the current object.


// It distinguishes the field from the parameter.
this.length = length;
this.width = width;
}

// Public getter for length.
public double getLength() {
return length;
}

// Public getter for width.
public double getWidth() {
return width;
}

// Method to calculate area.
public double getArea() {
return length * width;
}

// Method to calculate perimeter.
public double getPerimeter() {
return 2 * (length + width);
}

// Main method – entry point.


public static void main(String[] args) {

// Create an object of RectangleOOP.
// The constructor is called with arguments 5.0 and 3.0.
RectangleOOP rect = new RectangleOOP(5.0, 3.0);

// Call methods on the object.
System.out.println("OOP Approach:");
System.out.println("Length: " + rect.getLength());
System.out.println("Width: " + rect.getWidth());
System.out.println("Area: " + rect.getArea());
System.out.println("Perimeter: " + rect.getPerimeter());
}
} 
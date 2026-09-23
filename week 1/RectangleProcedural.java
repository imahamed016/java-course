// Procedural approach: data and methods are separate.
public class RectangleProcedural {

// A static method that calculates area.
// It takes two parameters: length and width.
// It returns the area as a double.
public static double calculateArea(double length, double width) {


// Multiply length and width, return the result.
return length * width;
}

// A static method that calculates perimeter.
public static double calculatePerimeter(double length, double width) {
// Formula: 2 * (length + width)
return 2 * (length + width);
}

// The main method – entry point.
public static void main(String[] args) {

// Declare variables for length and width.
double length = 5.0;
double width = 3.0;

// Call the method and store the result.
double area = calculateArea(length, width);

// Call the perimeter method.
double perimeter = calculatePerimeter(length, width);

// Print the results.
System.out.println("Procedural Approach:");
System.out.println("Length: " + length);


System.out.println("Width: " + width);
System.out.println("Area: " + area);
System.out.println("Perimeter: " + perimeter);
}
} 

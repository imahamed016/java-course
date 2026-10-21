// This class represents a Book and follows encapsulation principles.

public class Book {

// ============================================================
// 1. PRIVATE FIELDS (Attributes)
// ============================================================
// These are hidden from the outside world.
private String title;
private String author;
private double price;
private boolean isAvailable;



// ============================================================
// 2. CONSTRUCTOR
// ============================================================
// Initializes the object when it is created.
public Book(String title, String author, double price) {
this.title = title;
this.author = author;
setPrice(price); // Use setter to validate
this.isAvailable = true; // New books are available by default
}

// ============================================================
// 3. GETTERS (Accessors)
// ============================================================
// Used to READ private fields safely.
public String getTitle() {
return title;
}

public String getAuthor() {
return author;
}

public double getPrice() {
return price;
}



public boolean isAvailable() {
return isAvailable;
}

// ============================================================
// 4. SETTERS (Mutators)
// ============================================================
// Used to MODIFY private fields safely with validation.
public void setTitle(String title) {
this.title = title;
}

public void setAuthor(String author) {
this.author = author;
}

public void setPrice(double price) {
// Business Rule: Price cannot be negative
if (price >= 0) {
this.price = price;
} else {
System.out.println("Error: Price cannot be negative.");
}
}



// ============================================================
// 5. BEHAVIORAL METHODS
// ============================================================
// Actions the book can perform.
public void borrowBook() {
if (isAvailable) {
isAvailable = false;
System.out.println("You have borrowed: " + title);
} else {
System.out.println("Sorry, " + title + " is currently out of stock.");
}
}

public void returnBook() {
isAvailable = true;
System.out.println("You have returned: " + title);
}

// Method to display all details
public void displayBookInfo() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.printf("Price: KSh %.2f%n", price);
System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed"));
System.out.println("-------------------------");
}



}